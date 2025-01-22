import java.util.*;

public class Tenth {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

    
        double cmToInches = 2.54;
        int inchesPerFoot = 12;

       
        double totalInches = heightCm / cmToInches;

        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

      
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
