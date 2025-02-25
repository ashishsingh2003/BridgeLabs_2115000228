import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        String filePath = "students.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                System.out.printf("ID: %s, Name: %s, Age: %s, Marks: %s%n", details[0], details[1], details[2], details[3]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


