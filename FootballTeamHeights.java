import java.util.*;
public class FootballTeamHeights {
    public int[] generateRandomHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Random height between 150 and 250
        }
        return heights;
    }
    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }
    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }
    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        FootballTeamHeights team = new FootballTeamHeights();
        int[] heights = team.generateRandomHeights();
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));
        int sum = team.calculateSum(heights);
        double mean = team.calculateMean(heights);
        int shortest = team.findShortestHeight(heights);
        int tallest = team.findTallestHeight(heights);

        // Display the results
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }
}

