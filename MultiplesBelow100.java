import java.util.*;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the multiples below 100
        System.out.println("Multiples of " + number + " below 100 are:");

        // Run a for loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }
    }
}
