import java.util.*;
public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
