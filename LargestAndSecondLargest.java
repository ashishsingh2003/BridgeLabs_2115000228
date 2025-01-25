import java.util.*;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Define an array to store the digits, max size 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        // Initialize variables
        int index = 0;
        // Loop to store digits in the array
        while (number != 0) {
            digits[index] = number % 10;  // Extract last digit
            number = number / 10;  // Remove the last digit
            index++;
            
            // If array reaches max size, stop further input
            if (index == maxDigit) {
                break;
            }
        }

        // Find largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];  // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest
            }
        }
        // Display results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
