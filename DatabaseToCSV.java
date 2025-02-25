import org.apache.commons.csv.*;
import java.io.*;
import java.sql.*;
public class DatabaseToCSV{
    private static final String DB_URL="jdbc:mysql://localhost:3306/your_database";
    private static final String USER="your_username";
    private static final String PASSWORD="your_password";
    private static final String CSV_FILE="employees.csv";
    public static void main(String[] args){
        try(Connection conn=DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt=conn.createStatement();
             ResultSet rs=stmt.executeQuery("SELECT id, name, department, salary FROM employees");
             BufferedWriter writer=new BufferedWriter(new FileWriter(CSV_FILE));
             CSVPrinter csvPrinter=new CSVPrinter(writer,CSVFormat.DEFAULT.withHeader("Employee ID","Name","Department","Salary"))){
            while(rs.next()){
                csvPrinter.printRecord(rs.getInt("id"),rs.getString("name"),rs.getString("department"),rs.getBigDecimal("salary"));
            }
            System.out.println("CSV report generated "+CSV_FILE);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
