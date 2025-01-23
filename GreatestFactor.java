import java.util.*;
public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize greatestFactor to 1 (smallest possible factor besides the number itself)
        int greatestFactor = 1;

        // Create a for loop to find the greatest factor starting from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i; // Assign i as the greatest factor
                break; // Exit the loop once the greatest factor is found
            }
        }
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
