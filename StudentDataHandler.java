import java.io.*;

public class StudentDataHandler {
    public static void main(String[] args) {
        String filename = "students.dat";
        
        storeStudentData(filename);
        retrieveStudentData(filename);
    }

    private static void storeStudentData(String filename) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(101);
            dos.writeUTF("Alice Johnson");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob Smith");
            dos.writeDouble(3.5);

            System.out.println("Student data stored successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    private static void retrieveStudentData(String filename) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}

