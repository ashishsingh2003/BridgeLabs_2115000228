class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void displayInfo() {
        name = "Ashish Singh"; 
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        setCGPA(8.33);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent();
        student.rollNumber = 50;
        student.displayInfo();
    }
}

