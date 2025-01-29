import java.util.*;
public class MaxOfThree {
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int num = scanner.nextInt();
        return num;
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");
        
        int max = findMax(num1, num2, num3);
        displayResult(max);
    }
}
