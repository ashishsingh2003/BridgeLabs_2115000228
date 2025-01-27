import java.util.*;
class CalculateInterest{
	public double simpleInterest(double P,double R,double T){
		double interest=(P*R*T)/100;
		return interest;
	}
}
public class SimpleInterest{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double Principal=sc.nextDouble();
		double Rate=sc.nextDouble();
		double Time=sc.nextDouble();
		CalculateInterest Obj=new CalculateInterest();
		double Simpleinterest=Obj.simpleInterest(Principal,Rate,Time);
		System.out.print("The Simple Interest is "+Simpleinterest+" for Principal "+Principal+ " Rate of Interest "+ Rate +"and Time "+Time);
		
		
	}
}