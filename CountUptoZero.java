import java.util.*;
public class CountUptoZero {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;
    
        userInput = scanner.nextDouble();

        // While loop to sum numbers until the user enters 0
        while (userInput != 0) {
            total += userInput; // Add the input to the total
            userInput = scanner.nextDouble(); // Read the next input
        }

        // Print the total sum after exiting the loop
        System.out.println("The total sum is: " + total);
    }
}
