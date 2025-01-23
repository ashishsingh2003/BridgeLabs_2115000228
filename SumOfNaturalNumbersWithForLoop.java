import java.util.*;
public class SumOfNaturalNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number!");
        } else {
            // Calculate the sum using the formula n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare the two results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
