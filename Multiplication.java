import java.util.*;
public class Numbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number to generate multiplication table
        int number = scanner.nextInt();

        // Define an integer array to store multiplication table results
        int[] multiplicationTable = new int[10];

        // Generate the multiplication table and store results in the array
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        scanner.close();
    }
}
