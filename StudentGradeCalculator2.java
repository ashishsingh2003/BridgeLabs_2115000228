import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        
        // Create a 2D array to store marks of students in Physics, Chemistry, and Maths
        int[][] marks = new int[numberOfStudents][3];  // [][0] -> Physics, [][1] -> Chemistry, [][2] -> Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        // Input marks for each student and calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            // Input marks for Physics, Chemistry, and Maths, ensuring they are positive
            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) {
                        System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                    } else if (j == 1) {
                        System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                    } else {
                        System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                    }
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter positive values.");
                    }
                } while (marks[i][j] < 0);
            }
            
            // Calculate the percentage: (Physics + Chemistry + Maths) / 3
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            
            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "Grade A";
            } else if (percentages[i] >= 75) {
                grades[i] = "Grade B";
            } else if (percentages[i] >= 50) {
                grades[i] = "Grade C";
            } else {
                grades[i] = "Grade D";
            }
        }
        
        // Display the marks, percentages, and grades for each student
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%.2f\t\t%s\n", 
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
