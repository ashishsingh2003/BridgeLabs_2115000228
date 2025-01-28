import java.util.*;
public class GenerateUniqueOtp {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    // Method to check if all OTPs in an array are unique
    public static boolean areUniqueOTPs(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueSet.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check if OTPs are unique
        boolean areUnique = areUniqueOTPs(otps);
        System.out.println("Are all OTPs unique? " + areUnique);
    }
}

