import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Count the number of digits in the number
        int count = 0;
        int tempNumber = number;
        
        // Find the number of digits
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        
        // Store the digits in the array
        tempNumber = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;  // Extract the last digit
            tempNumber = tempNumber / 10;  // Remove the last digit
        }
        
        // Display the digits in reverse order (the array is already in reverse order)
        System.out.print("The reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
