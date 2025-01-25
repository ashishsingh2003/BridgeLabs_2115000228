import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [][0] -> height, [][1] -> weight, [][2] -> BMI
        String[] weightStatus = new String[numberOfPersons];  // To store weight status
        
        // Input height and weight for each person and calculate BMI and status
        for (int i = 0; i < numberOfPersons; i++) {
            // Take input for height and weight, ensure they are positive values
            do {
                System.out.print("\nEnter height of person " + (i + 1) + " in meters: ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter weight of person " + (i + 1) + " in kilograms: ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please enter again.");
                }
            } while (personData[i][1] <= 0);
            
            // Calculate BMI: BMI = weight / (height * height)
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
       
    }
}
