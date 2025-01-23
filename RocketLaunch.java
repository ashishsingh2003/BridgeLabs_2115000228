import java.util.*;
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        // For loop to perform the countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current value
        }
        // Print the launch message after the countdown
        System.out.println("Liftoff! Rocket launched successfully!");
    }
}
