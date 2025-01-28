import java.util.*;
public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3.0;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println(convertYardsToFeet(5.0));
        System.out.println(convertFeetToYards(15.0));
        System.out.println(convertMetersToInches(2.0));
        System.out.println(convertInchesToMeters(78.0));
        System.out.println(convertInchesToCentimeters(12.0));
    }
}

