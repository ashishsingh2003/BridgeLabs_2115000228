import java.util.*;
public class NumberChecker {

    
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }


    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

   
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.indexOf('0') > 0; // '0' not allowed in the first position
    }

    
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

  
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number for testing

        System.out.println("Number: " + number);

        // Count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Check if it's a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if it's an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestTwo));

        // Find smallest and second smallest
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestTwo));
    }
}

