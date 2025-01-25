import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int[] age = new int[3];
        double[] height = new double[3];
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // Input loop for age and height of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = scanner.nextInt();
            
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            height[i] = scanner.nextDouble();
        }
        
        // Find the youngest and the tallest friend
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i; // Update index of youngest
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i; // Update index of tallest
            }
        }

        // Display the youngest and tallest friend
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + age[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + height[tallestIndex] + " cm.");
    }
}
