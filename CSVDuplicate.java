import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;
public class CSVDuplicate{
    public static void main(String[] args){
        String filePath="students.csv";
        Set<String> uniqueIds=new HashSet<>();
        List<String> duplicateRecords=new ArrayList<>();
        try (FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                String id=record.get("ID");
                String row=record.toString();
                if(!uniqueIds.add(id)){
                    duplicateRecords.add(row);
                }
            }
            if(!duplicateRecords.isEmpty()){
                System.out.println("Duplicate Records Found");
                for(String duplicate:duplicateRecords){
                    System.out.println(duplicate);
                }
            } 
            else{
                System.out.println("No duplicate records found");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
