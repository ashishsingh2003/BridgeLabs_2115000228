import org.apache.commons.csv.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
public class CSVEncryptDecrypt{
    private static final String SECRET_KEY ="1234567890123456";
    private static final String CSV_FILE="employees.csv";
    private static final String ENCRYPTED_CSV_FILE="encrypted_employees.csv";
    private static final String DECRYPTED_CSV_FILE="decrypted_employees.csv";
    public static void main(String[] args){
        writeEncryptedCSV();
        readDecryptedCSV();
    }
    public static void writeEncryptedCSV(){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(ENCRYPTED_CSV_FILE));
             CSVPrinter csvPrinter=new CSVPrinter(writer,CSVFormat.DEFAULT.withHeader("ID", "Name", "Email", "Salary"))) {
            String[][] employees={
                {"1", "John Doe", "john@example.com", "75000"},
                {"2", "Alice Smith", "alice@example.com", "65000"},
                {"3", "Bob Johnson", "bob@example.com", "70000"}
            };
            for(String[] emp:employees){
                csvPrinter.printRecord(
                        emp[0], emp[1],
                        encrypt(emp[2]), encrypt(emp[3])
                );
            }
            System.out.println("Encrypted CSV file created "+ENCRYPTED_CSV_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readDecryptedCSV(){
        try (BufferedReader reader=new BufferedReader(new FileReader(ENCRYPTED_CSV_FILE));
             CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
             BufferedWriter writer=new BufferedWriter(new FileWriter(DECRYPTED_CSV_FILE));
             CSVPrinter csvPrinter=new CSVPrinter(writer,CSVFormat.DEFAULT.withHeader("ID", "Name", "Email", "Salary"))){
            for(CSVRecord record:csvParser){
                csvPrinter.printRecord(
                        record.get("ID"),record.get("Name"),
                        decrypt(record.get("Email")),decrypt(record.get("Salary"))
                );
            }
            System.out.println("Decrypted CSV file created "+DECRYPTED_CSV_FILE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String encrypt(String value) throws Exception{
        Cipher cipher=Cipher.getInstance("AES");
        SecretKeySpec keySpec=new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        cipher.init(Cipher.ENCRYPT_MODE,keySpec);
        return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes(StandardCharsets.UTF_8)));
    }
    public static String decrypt(String encryptedValue) throws Exception{
        Cipher cipher=Cipher.getInstance("AES");
        SecretKeySpec keySpec=new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8),"AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedValue)), StandardCharsets.UTF_8);
    }
}
