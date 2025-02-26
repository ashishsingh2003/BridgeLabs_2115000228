import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IPLCensorAnalyzer {
    public static void main(String[] args) throws IOException {
        processJSON("ipl_matches.json", "censored_ipl_matches.json");
        processCSV("ipl_matches.csv", "censored_ipl_matches.csv");
    }

    // Method to process JSON data
    private static void processJSON(String inputFile, String outputFile) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(inputFile)));
        JSONArray matches = new JSONArray(content);

        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);
            match.put("team1", censorTeamName(match.getString("team1")));
            match.put("team2", censorTeamName(match.getString("team2")));
            match.put("winner", censorTeamName(match.getString("winner")));
            match.put("player_of_match", "REDACTED");
        }

        Files.write(Paths.get(outputFile), matches.toString(4).getBytes());
        System.out.println("Censored JSON data written to " + outputFile);
    }

    // Method to process CSV data
    private static void processCSV(String inputFile, String outputFile) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        writer.write(lines.get(0)); // Write headers
        writer.newLine();

        for (int i = 1; i < lines.size(); i++) {
            String[] data = lines.get(i).split(",");
            data[1] = censorTeamName(data[1]); // Censor team1
            data[2] = censorTeamName(data[2]); // Censor team2
            data[5] = censorTeamName(data[5]); // Censor winner
            data[6] = "REDACTED"; // Redact player of match

            writer.write(String.join(",", data));
            writer.newLine();
        }

        writer.close();
        System.out.println("Censored CSV data written to " + outputFile);
    }

    // Method to censor team names
    private static String censorTeamName(String teamName) {
        String[] words = teamName.split(" ");
        return words[0] + " ***";
    }
}

