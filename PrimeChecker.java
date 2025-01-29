import java.util.Scanner;
public class PrimeChecker {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        return num;
    }

    public static void displayResult(int num, boolean isPrime) {
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        int number = getInput();
        boolean result = isPrime(number);
        displayResult(number, result);
    }
}
