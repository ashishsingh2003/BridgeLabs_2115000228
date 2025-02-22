import java.util.regex.*;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5\\d{15}$";
        return cardNumber.matches(visaPattern) || cardNumber.matches(masterCardPattern);
    }

    public static void main(String[] args) {
        System.out.println(isValidCreditCard("4111111111111111")); // true (Visa)
        System.out.println(isValidCreditCard("5111111111111111")); // true (MasterCard)
        System.out.println(isValidCreditCard("6111111111111111")); // false
    }
}

