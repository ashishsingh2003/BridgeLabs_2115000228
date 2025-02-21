import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
