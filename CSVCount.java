import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
public class CSVCount{
    public static void main(String[] args){
        String filePath="students.csv";
        int rowCount=0;
        try (FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                rowCount++;
            }
            System.out.println("Total Records  "+rowCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

