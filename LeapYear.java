import java.util.*;
public class LeapYear
{
    public static void leapYear(int n)
    {
        if((n%4==0&&n%100!=0)||n%400==0)
        {
            System.out.print("It is a leap year");
        }
        else{
            System.out.print("It is not a leap year");
        }
        return;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year greater than 1582");
		int n=sc.nextInt();
		leapYear(n);
		
	}
}

