import java.io.*;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("ID,Name,Department,Salary\n");
            bw.write("101,John Doe,IT,60000\n");
            bw.write("102,Jane Smith,HR,55000\n");
            bw.write("103,Robert Brown,Finance,70000\n");
            bw.write("104,Emily Davis,Marketing,65000\n");
            bw.write("105,Michael Wilson,Sales,62000\n");
            System.out.println("Data written successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

