import org.apache.commons.csv.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class CSVUpdate{
    public static void main(String[] args){
        String inputFile="employees.csv";
        String outputFile="updated_employees.csv";
        try (Reader reader=Files.newBufferedReader(Paths.get(inputFile));
             CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
             BufferedWriter writer=Files.newBufferedWriter(Paths.get(outputFile));
             CSVPrinter csvPrinter=new CSVPrinter(writer,CSVFormat.DEFAULT.withHeader("ID","Name","Department","Salary"))){
            for (CSVRecord record:csvParser){
                String id=record.get("ID");
                String name=record.get("Name");
                String department = record.get("Department");
                double salary=Double.parseDouble(record.get("Salary"));
                if(department.equalsIgnoreCase("IT")){
                    salary*=1.10;
                }
                csvPrinter.printRecord(id, name, department, String.format("%.2f", salary));
            }
            System.out.println("Salaries updated successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

