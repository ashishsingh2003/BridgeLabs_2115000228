import org.apache.commons.csv.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class CSVSort{
    public static void main(String[] args){
        String filePath="employees.csv";
        List<CSVRecord> records=new ArrayList<>();
        try(FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            records.addAll(csvParser.getRecords());
            records.sort(Comparator.comparingDouble(r -> -Double.parseDouble(r.get("Salary"))));
            System.out.println("Top 5 Highest Paid Employees");
            for(int i=0;i<Math.min(5,records.size());i++){
                CSVRecord record=records.get(i);
                System.out.println("ID "+record.get("ID"));
                System.out.println("Name "+record.get("Name"));
                System.out.println("Department "+record.get("Department"));
                System.out.println("Salary "+record.get("Salary"));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
