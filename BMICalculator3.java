import java.util.*;
public class BMICalculator3 {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        calculateBMI(data);

        for (int i = 0; i < data.length; i++) {
            statuses[i] = determineBMIStatus(data[i][2]);
        }

        System.out.println("\nDetails of Each Person:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }
}

