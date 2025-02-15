import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        compareStringBuilderAndStringBuffer(iterations, text);
        compareFileReaderAndInputStreamReader("large_file.txt");
    }

    public static void compareStringBuilderAndStringBuffer(int iterations, String text) {
        long startTime, endTime;

        // StringBuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");

        // StringBuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReaderAndInputStreamReader(String fileName) {
        long startTime, endTime;

        // FileReader performance
        startTime = System.nanoTime();
        int fileReaderWordCount = countWordsUsingFileReader(fileName);
        endTime = System.nanoTime();
        System.out.println("FileReader word count: " + fileReaderWordCount);
        System.out.println("FileReader time: " + (endTime - startTime) / 1_000_000 + " ms");

        // InputStreamReader performance
        startTime = System.nanoTime();
        int inputStreamReaderWordCount = countWordsUsingInputStreamReader(fileName);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + inputStreamReaderWordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static int countWordsUsingFileReader(String fileName) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String fileName) {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}

