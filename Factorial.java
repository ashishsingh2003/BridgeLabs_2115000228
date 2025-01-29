import java.util.*;
public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        int number = getInput();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }
    }
}
