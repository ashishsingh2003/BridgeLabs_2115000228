import java.util.*;
public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Define a double array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Get input values from the user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + mean);
    }
}
