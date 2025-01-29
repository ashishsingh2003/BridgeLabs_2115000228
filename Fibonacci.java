import java.util.Scanner;
public class Fibonacci{
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first);

        if (terms > 1) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= terms; i++) {
            long next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();
        return terms;
    }

    public static void main(String[] args) {
        int terms = getInput();
        generateFibonacci(terms);
    }
}
