import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define arrays to store employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        // Input loop for employee data
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = scanner.nextDouble();
                
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                
                // Validate salary and years of service
                if (salary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input! Please enter positive values.");
                } else {
                    validInput = true;
                }
            }
        }
        
        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for employees with less than 5 years of service
            }
            
            newSalary[i] = salary[i] + bonus[i];
            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // Print the total bonus, total old salary, and total new salary
        System.out.println("\nTotal Bonus payout: " + totalBonus);
        System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total New Salary of all employees: " + totalNewSalary);
    }
}
