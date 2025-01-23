import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Input the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Find all divisors of the number and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor of number
                sum += i;         // Add i to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}
