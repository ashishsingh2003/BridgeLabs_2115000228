import java.util.ArrayList;

class HospitalClass {
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    public HospitalClass() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        System.out.println(name + " is consulting with " + patient.getName());
        patients.add(patient);
    }
}

class Patient {
    String name;
    ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Doctor doctor) {
        System.out.println(name + " is consulting with " + doctor.name);
        doctors.add(doctor);
    }
}

public class Hospital {
    public static void main(String[] args) {
        HospitalClass HospitalClass = new HospitalClass();

        Doctor doctor1 = new Doctor("Dr. Ashish");
        Doctor doctor2 = new Doctor("Dr. Singh");

        Patient patient1 = new Patient("Ayan");
        Patient patient2 = new Patient("Dhairya");

        HospitalClass.addDoctor(doctor1);
        HospitalClass.addDoctor(doctor2);

        HospitalClass.addPatient(patient1);
        HospitalClass.addPatient(patient2);

        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);

        patient1.consult(doctor1);
        patient2.consult(doctor2);
    }
}

