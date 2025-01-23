import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base number
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        // Input the power
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Run a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
