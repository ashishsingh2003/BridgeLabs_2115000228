import java.util.*;

public class Fourteen {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

       
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

      
        System.out.println("The distance in feet is " + distanceInFeet +
                           ", in yards is " + distanceInYards +
                           ", and in miles is " + distanceInMiles);
    }
}
