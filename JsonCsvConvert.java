import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;
public class JsonCsvConvert{
    private static final String JSON_FILE="students.json";
    private static final String CSV_FILE="students.csv";
    private static final String OUTPUT_JSON_FILE="converted_students.json";
    public static void main(String[] args){
        jsonToCsv(JSON_FILE, CSV_FILE);
        csvToJson(CSV_FILE, OUTPUT_JSON_FILE);
    }
    public static void jsonToCsv(String jsonFile,String csvFile){
        try {
            ObjectMapper objectMapper=new ObjectMapper();
            List<Map<String, Object>> students=objectMapper.readValue(new File(jsonFile),new TypeReference<>() {});
            try (BufferedWriter writer=new BufferedWriter(new FileWriter(csvFile));
                 CSVPrinter csvPrinter=new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("ID", "Name", "Age", "Marks"))) {
                for(Map<String, Object> student:students){
                    csvPrinter.printRecord(student.get("ID"), student.get("Name"), student.get("Age"), student.get("Marks"));
                }
            }
            System.out.println("JSON converted to CSV "+csvFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void csvToJson(String csvFile,String jsonFile){
        List<Map<String, Object>> studentList=new ArrayList<>();
        try(BufferedReader reader=new BufferedReader(new FileReader(csvFile));
             CSVParser csvParser=new CSVParser(reader,CSVFormat.DEFAULT.withFirstRecordAsHeader())){
            for(CSVRecord record:csvParser){
                Map<String, Object> student=new HashMap<>();
                student.put("ID",Integer.parseInt(record.get("ID")));
                student.put("Name",record.get("Name"));
                student.put("Age",Integer.parseInt(record.get("Age")));
                student.put("Marks",Integer.parseInt(record.get("Marks")));
                studentList.add(student);
            }
            ObjectMapper objectMapper=new ObjectMapper();
            objectMapper.writeValue(new File(jsonFile),studentList);
            System.out.println("CSV converted back to JSON "+jsonFile);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
