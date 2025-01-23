import java.util.*;
public class SumUntilZero{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        // Infinite while loop
        while (true) {
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }
            total += userInput;
        }
        // Print the total sum after exiting the loop
        System.out.println("The total sum is: " + total);
    }
}
