import java.time.LocalDate;
import java.util.Scanner;
public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1Input = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Input);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2Input = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Input);

        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }
    }
}
