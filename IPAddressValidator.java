import java.util.regex.*;

public class IPAddressValidator {
    public static boolean isValidIPAddress(String ip) {
        String ipPattern = 
            "\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";
        return ip.matches(ipPattern);
    }

    public static void main(String[] args) {
        System.out.println(isValidIPAddress("192.168.1.1")); // true
        System.out.println(isValidIPAddress("256.100.50.25")); // false
    }
}

