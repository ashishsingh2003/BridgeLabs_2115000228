import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum to 0 and assign originalNumber the value of number
        int sum = 0;
        int originalNumber = number;

        // Use while loop to calculate the sum of cubes of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Get the last digit
            sum += Math.pow(remainder, 3);      // Add cube of the digit to sum
            originalNumber /= 10;              // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
