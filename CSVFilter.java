import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
public class CSVFilter{
    public static void main(String[] args){
        String filePath="students.csv";
        try(FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            System.out.println("Students who scored more than 80 marks");
            for(CSVRecord record:csvParser){
                int marks=Integer.parseInt(record.get("Marks"));
                if(marks>80){
                    System.out.println("ID "+record.get("ID"));
                    System.out.println("Name "+record.get("Name"));
                    System.out.println("Age "+record.get("Age"));
                    System.out.println("Marks "+record.get("Marks"));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

