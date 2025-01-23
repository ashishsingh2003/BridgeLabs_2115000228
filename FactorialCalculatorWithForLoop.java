import java.util.*;
public class FactorialCalculatorWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            // Initialize factorial to 1
            long factorial = 1; 

            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply by the current value of i
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
