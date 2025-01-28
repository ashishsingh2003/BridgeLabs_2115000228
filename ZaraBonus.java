import java.util.*;
public class ZaraBonus {

    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2];  // 2D array to store salary and years of service

        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 10000 + (random.nextInt(90000)); // Generate random 5-digit salary
            employeeData[i][1] = random.nextInt(20); // Generate random years of service (0 to 19)
        }

        return employeeData;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // 2D array to store old salary, new salary, and bonus

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;  // Old Salary
            updatedData[i][1] = newSalary;  // New Salary
            updatedData[i][2] = bonus;      // Bonus
        }

        return updatedData;
    }

    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee | Old Salary | New Salary | Bonus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];

            System.out.printf("%8d | %.2f | %.2f | %.2f\n", i + 1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

    
        System.out.printf("Total    | %.2f | %.2f | %.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
}

