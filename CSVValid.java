import org.apache.commons.csv.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class CSVValid{
    public static void main(String[] args){
        String filePath="employees.csv";
        String emailRegex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex="^[0-9]{10}$";
        Pattern emailPattern=Pattern.compile(emailRegex);
        Pattern phonePattern=Pattern.compile(phoneRegex);
        try(FileReader reader=new FileReader(filePath);
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            System.out.println("Checking for invalid rows");
            for(CSVRecord record:csvParser){
                String email=record.get("Email");
                String phone=record.get("Phone");
                boolean isValid=true;
                if(!emailPattern.matcher(email).matches()){
                    System.out.println("Invalid Email "+email);
                    isValid=false;
                }
                if(!phonePattern.matcher(phone).matches()){
                    System.out.println("Invalid Phone "+phone);
                    isValid=false;
                }
                if(!isValid){
                    System.out.println("Row "+record);
                }
            }
            System.out.println("Validation completed");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
