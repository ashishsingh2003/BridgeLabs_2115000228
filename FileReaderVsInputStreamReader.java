import java.io.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "large.txt";
        compareFileReader(filePath);
        compareInputStreamReader(filePath);
    }

    public static void compareFileReader(String filePath) {
        long startTime = System.nanoTime();
        try (FileReader reader = new FileReader(filePath)) {
            while (reader.read() != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("FileReader Time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static void compareInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
            while (reader.read() != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

