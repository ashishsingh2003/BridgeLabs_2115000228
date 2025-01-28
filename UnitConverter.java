import java.util.*;
public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println(convertKmToMiles(5.0));
        System.out.println(convertMilesToKm(3.1));
        System.out.println(convertMetersToFeet(10.0));
        System.out.println(convertFeetToMeters(32.8));
    }
}

