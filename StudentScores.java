
import java.util.*;
public class StudentScores {

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array to store scores for each student in Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Random score for Physics (50-100)
            scores[i][1] = 50 + random.nextInt(51); // Random score for Chemistry (50-100)
            scores[i][2] = 50 + random.nextInt(51); // Random score for Math (50-100)
        }

        return scores;
    }

    public static double[][] calculateTotalsAndAverages(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // 2D array to store total, average, and percentage for each student

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounding off to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounding off to 2 decimal places
        }

        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%7d\t| %7d\t| %9d\t| %4d\t| %5.2f\t| %7.2f\t| %9.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotalsAndAverages(scores, numStudents);
        displayScorecard(scores, results, numStudents);
    }
}

