import java.util.regex.Pattern;

public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username.length() < 5) {
            throw new IllegalArgumentException("Username must be at least 5 characters long.");
        }

        if (!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        if (!password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit.");
        }
    }
}

