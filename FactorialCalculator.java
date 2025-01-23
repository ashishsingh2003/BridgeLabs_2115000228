import java.util.*;
public class FactorialCalculator {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            // Initialize variables
            long factorial = 1; // Factorial can grow large, so use long
            int counter = number;

            // Compute the factorial using a while loop
            while (counter > 0) {
                factorial *= counter; // Multiply by the current counter value
                counter--; // Decrement the counter
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
