import java.util.*;
public class Eighteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;        
        int result2 = a * b + c;       
        int result3 = c + a / b;        
        int result4 = a % b + c;        
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}
