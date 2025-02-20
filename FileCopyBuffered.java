import java.io.*;

public class FileCopyBuffered {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destinationFile = "copy_largefile.txt";
        
        copyUsingUnbufferedStreams(sourceFile, destinationFile);
        copyUsingBufferedStreams(sourceFile, destinationFile);
    }
    
    private static void copyUsingUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Unbuffered Streams Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    
    private static void copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

