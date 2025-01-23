import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive natural number!");
        } else {
            // Calculate the sum using the formula n * (n + 1) / 2
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a while loop
            int loopSum = 0;
            int counter = 1;

            while (counter <= n) {
                loopSum += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }
    }
}
