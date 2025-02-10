import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    
    public abstract double calculateBill();
    
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> medicalRecords = new ArrayList<>();
    
    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }
    
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }
    
    public void addRecord(String record) {
        medicalRecords.add(record);
    }
    
    public List<String> viewRecords() {
        return medicalRecords;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords = new ArrayList<>();
    
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    
    public double calculateBill() {
        return consultationFee;
    }
    
    public void addRecord(String record) {
        medicalRecords.add(record);
    }
    
    public List<String> viewRecords() {
        return medicalRecords;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("P101", "John Doe", 45, 2000, 5));
        patients.add(new OutPatient("P202", "Jane Smith", 30, 500));
        
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord recordable = (MedicalRecord) patient;
                recordable.addRecord("Initial diagnosis recorded.");
                System.out.println("Medical Records: " + recordable.viewRecords());
            }
            System.out.println();
        }
    }
}
