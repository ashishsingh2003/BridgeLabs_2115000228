import java.util.*;
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get the number input from the user
        int number = scanner.nextInt();

        // Define an integer array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Calculate the multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display the multiplication table
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
    }
}
