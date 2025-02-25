import org.apache.commons.csv.*;
import java.io.*;
public class LargeCSV{
    public static void main(String[] args){
        String filePath="large_students.csv";
        int batchSize=100;
        int recordCount=0;
        try(BufferedReader reader=new BufferedReader(new FileReader(filePath));
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                recordCount++;
                if(recordCount%batchSize==0){
                    System.out.println("Processed "+recordCount+" records");
                }
            }
            System.out.println("Total records processed "+recordCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
