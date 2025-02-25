import org.apache.commons.csv.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CSVToObject{
    public static void main(String[] args){
        String filePath="students.csv";
        List<Student> students=new ArrayList<>();
        try(FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                int id=Integer.parseInt(record.get("ID"));
                String name=record.get("Name");
                int age=Integer.parseInt(record.get("Age"));
                int marks=Integer.parseInt(record.get("Marks"));
                students.add(new Student(id,name,age,marks));
            }
            for(Student student:students){
                System.out.println(student);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
