import java.util.*;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Initialize the counter to 1
            int i = 1;
            
            // Use while loop to iterate from 1 to the entered number
            while (i <= number) {
                // Check for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    // For other numbers, just print the number
                    System.out.println(i);
                }
                // Increment the counter
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
