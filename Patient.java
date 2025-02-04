class PatientClass {
    static String hospitalName = "City Hospital";
    static int totalPatientClasss = 0;
    String name;
    int age;
    String ailment;
    final int PatientClassID;

    public PatientClass(String name, int age, String ailment, int PatientClassID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.PatientClassID = PatientClassID;
        totalPatientClasss++;
    }

    public static int getTotalPatientClasss() {
        return totalPatientClasss;
    }

    public void displayPatientClassDetails() {
        if (this instanceof PatientClass) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("PatientClass Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("PatientClass ID: " + PatientClassID);
        } else {
            System.out.println("Invalid PatientClass object.");
        }
    }
}

public class Patient {
    public static void main(String[] args) {
        PatientClass p1 = new PatientClass("Ashish Singh", 21, "Flu", 101);
        PatientClass p2 = new PatientClass("Gaurav", 21, "Diabetes", 102);

        p1.displayPatientClassDetails();
        System.out.println();
        p2.displayPatientClassDetails();

        System.out.println("\nTotal PatientClasss Admitted: " + PatientClass.getTotalPatientClasss());
    }
}
