import java.util.*;
public class TwentyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the name of the city you are traveling from: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter the name of the via city: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter the name of your destination city: ");
        String toCity = sc.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in hours: ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in hours: ");
        double timeViaToFinalCity = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("\nTravel Details for " + name + ":");
        System.out.println("The total distance traveled from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles.");
        System.out.println("The total time taken for the journey is " + totalTime + " hours.");

    }
}
