import java.util.*;
class CalculateHandshake{
	public int maximumHandshake(int n){
		int handshake=(n*(n-1))/2;
		return handshake;
	}
}
public class MaximumHandshake{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CalculateHandshake Obj=new CalculateHandshake();
		int handshake=Obj.maximumHandshake(n);
		System.out.print(handshake);
		
		
	}
}