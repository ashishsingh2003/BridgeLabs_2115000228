import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;
public class CSVMerge{
    public static void main(String[] args){
        String file1="students1.csv";
        String file2="students2.csv";
        String outputFile="merged_students.csv";
        Map<String, String[]> studentData=new HashMap<>();
        try(FileReader reader1=new FileReader(file1);
             CSVParser parser1=new CSVParser(reader1,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:parser1){
                String id=record.get("ID");
                String name=record.get("Name");
                String age=record.get("Age");
                studentData.put(id,new String[]{name,age,"",""});
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileReader reader2=new FileReader(file2);
             CSVParser parser2=new CSVParser(reader2,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:parser2){
                String id=record.get("ID");
                String marks=record.get("Marks");
                String grade=record.get("Grade");
                if(studentData.containsKey(id)){
                    studentData.get(id)[2]=marks;
                    studentData.get(id)[3]=grade;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile));
             CSVPrinter csvPrinter=new CSVPrinter(writer,CSVFormat.DEFAULT.withHeader("ID","Name","Age","Marks","Grade"))){
            for(Map.Entry<String,String[]> entry:studentData.entrySet()){
                csvPrinter.printRecord(entry.getKey(),entry.getValue()[0],entry.getValue()[1],entry.getValue()[2],entry.getValue()[3]);
            }
            System.out.println("Merged file created "+outputFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
