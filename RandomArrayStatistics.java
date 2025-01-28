import java.util.*;
public class RandomArrayStatistics {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); // Generates a random 4-digit number
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum value of an array
    public double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        result[0] = (double) sum / numbers.length; // Average
        result[1] = min; // Minimum
        result[2] = max; // Maximum

        return result;
    }

    public static void main(String[] args) {
        RandomArrayStatistics stats = new RandomArrayStatistics();

       
        int[] randomNumbers = stats.generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + Arrays.toString(randomNumbers));

        // Calculate the average, min, and max values
        double[] results = stats.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}

