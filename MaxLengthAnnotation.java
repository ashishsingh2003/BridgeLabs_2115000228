import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) throws IllegalArgumentException {
        validateMaxLength(username);
        this.username = username;
    }

    private void validateMaxLength(String username) throws IllegalArgumentException {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (username.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength.value() + " characters.");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

public class MaxLengthAnnotation {
    public static void main(String[] args) {
        try {
            User user1 = new User("JohnDoe"); // Valid
            System.out.println("User created successfully: " + user1);
            
            User user2 = new User("VeryLongUsername"); // Invalid
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

