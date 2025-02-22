import java.util.regex.*;

public class Validator {
    public static boolean isValidUsername(String username) {
        return username.matches("[a-zA-Z][a-zA-Z0-9_]{4,14}");
    }
    
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("[A-Z]{2}\d{4}");
    }
    
    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123")); // true
        System.out.println(isValidUsername("123user")); // false
        System.out.println(isValidUsername("us")); // false
        
        System.out.println(isValidLicensePlate("AB1234")); // true
        System.out.println(isValidLicensePlate("A12345")); // false
    }
}

