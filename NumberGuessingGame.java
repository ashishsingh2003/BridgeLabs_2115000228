import java.util.*;
public class NumberGuessingGame {
    
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static String getUserFeedback(int guess) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is your number " + guess + "? (Enter 'higher', 'lower', or 'correct'): ");
        String feedback = scanner.nextLine().toLowerCase();
        return feedback;
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");
        
        do {
            guess = generateGuess(lowerBound, upperBound);
            feedback = getUserFeedback(guess);
            
            if (feedback.equals("higher")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("lower")) {
                upperBound = guess - 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid feedback. Please respond with 'higher', 'lower', or 'correct'.");
            }
        } while (!feedback.equals("correct"));
        
        System.out.println("Yay! I guessed your number!");
    }

    public static void main(String[] args) {
        playGame();
    }
}
