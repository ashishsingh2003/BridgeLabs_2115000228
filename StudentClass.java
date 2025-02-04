class Student {
    static String universityName = "GLA University";  
    static int totalStudents = 0; 
   
    String name;
    final int rollNumber;  
    char grade;

   
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }


    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid Student object.");
        }
    }

  
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade has been updated to: " + grade);
        } else {
            System.out.println("Cannot update grade. Invalid Student object.");
        }
    }
}

public class StudentClass {
    public static void main(String[] args) {
      
        Student student1 = new Student("Ashish Singh", 101, 'A');
        Student student2 = new Student("Gaurav", 102, 'B');

      
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student2.updateGrade('A');
        System.out.println();
        Student.displayTotalStudents();
    }
}
