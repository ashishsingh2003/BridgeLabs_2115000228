import java.util.*;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define an initial max size for the digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Initialize variables
        int index = 0;
        
        // Loop to store digits in the array
        while (number != 0) {
            digits[index] = number % 10;  // Extract last digit
            number = number / 10;  // Remove the last digit
            index++;
            
            // If array reaches max size, increase the size
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;
                
                // Create a temporary array to store more digits
                int[] tempArray = new int[maxDigit];
                
                // Copy all elements from the old digits array to the temp array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                
                // Assign the temp array to the digits array
                digits = tempArray;
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
