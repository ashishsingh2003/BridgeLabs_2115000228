import java.util.*;
public class MultipleValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        // Infinite loop to get user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            // Break if input is 0 or negative, or if array is full
            if (input <= 0 || index == 10) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all numbers and the total
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total: " + total);
    }
}
