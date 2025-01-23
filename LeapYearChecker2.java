import java.util.*;
public class LeapYearChecker2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        // Check if the year is valid for the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year must be 1582 or later. Please enter a valid year.");
        } else {
            // Check for leap year using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
