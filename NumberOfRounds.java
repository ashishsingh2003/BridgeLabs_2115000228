import java.util.*;
public class NumberOfRounds{
	public double numberOfRounds(double perimeter){
		return 5/perimeter;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double perimeter=a+b+c;
		NumberOfRounds obj=new NumberOfRounds();
		double rounds=obj.numberOfRounds(perimeter);
		System.out.print("Number of Rounds "+rounds+ " to complete 5km." );
	}
}
