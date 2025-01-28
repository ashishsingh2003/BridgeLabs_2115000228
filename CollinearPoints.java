import java.util.*;
public class CollinearPoints {

    public static boolean checkCollinearityUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    public static boolean checkCollinearityUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of point B (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates of point C (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean isCollinearUsingSlope = checkCollinearityUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearUsingArea = checkCollinearityUsingArea(x1, y1, x2, y2, x3, y3);

        if (isCollinearUsingSlope && isCollinearUsingArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}

