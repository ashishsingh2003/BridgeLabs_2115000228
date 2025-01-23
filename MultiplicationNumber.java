import java.util.*;
public class MultiplicationNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Generate and print the multiplication table for the range 6 to 9
        System.out.println("Multiplication table for " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
