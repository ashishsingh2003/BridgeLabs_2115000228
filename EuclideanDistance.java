import java.util.*;
public class EuclideanDistance {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1, y1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2, y2:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        double[] equation = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
    }
}

