import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class EmployeeSearch{
    public static void main(String[] args){
        String filePath="employees.csv";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name to search ");
        String searchName=sc.nextLine().trim();
        boolean found=false;
        try(FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                if(record.get("Name").equalsIgnoreCase(searchName)){
                    System.out.println("Employee Found");
                    System.out.println("Department "+record.get("Department"));
                    System.out.println("Salary "+record.get("Salary"));
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Employee not found");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

