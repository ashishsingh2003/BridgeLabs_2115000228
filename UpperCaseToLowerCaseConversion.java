import java.io.*;

public class UppercaseToLowercaseConversion {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        convertUppercaseToLowercase(inputFile, outputFile);
    }

    private static void convertUppercaseToLowercase(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            
            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}

