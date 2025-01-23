import java.util.*;
public class FactorsOfNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the factors
        System.out.println("The factors of " + number + " are:");

        // Run a for loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }
}
