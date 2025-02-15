import java.io.*;

public class WordCountInFile {
    public static int countWordOccurrences(String fileName, String targetWord) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static void main(String[] args) {
        String fileName = "example.txt";
        String targetWord = "hello";

        int occurrences = countWordOccurrences(fileName, targetWord);
        System.out.println("The word \"" + targetWord + "\" appears " + occurrences + " times in the file.");
    }
}

