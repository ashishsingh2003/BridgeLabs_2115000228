import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        // Create arrays to store the weight, height, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];
        
        // Input height and weight for each person and calculate BMI and status
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("\nEnter height of person " + (i + 1) + " in meters: ");
            height[i] = scanner.nextDouble();
            
            System.out.print("Enter weight of person " + (i + 1) + " in kilograms: ");
            weight[i] = scanner.nextDouble();
            
            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Display the height, weight, BMI, and weight status for each person
      
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}
