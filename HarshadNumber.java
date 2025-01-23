import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum to 0 and store the original number
        int sum = 0;
        int originalNumber = number;

        // Use while loop to calculate the sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            sum += digit;                   // Add digit to sum
            originalNumber /= 10;           // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
