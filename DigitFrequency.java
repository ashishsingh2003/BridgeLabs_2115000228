import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Convert number to an array of digits
        int[] digits = new int[20];  // Assuming number of digits won't exceed 20
        int index = 0;
        
        // Store digits in the digits array
        while (number != 0) {
            digits[index] = (int) (number % 10);  // Extract the last digit
            number /= 10;  // Remove the last digit
            index++;
        }
        
        // Frequency array to store the count of each digit (0-9)
        int[] frequency = new int[10];
        
        // Count the frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        
        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
