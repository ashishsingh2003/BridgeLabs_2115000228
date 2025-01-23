import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms (double type)
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        // Input height in centimeters (double type)
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Display BMI result
        System.out.println("Your BMI is: " + bmi);

        // Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have obesity.");
        }
    }
}
