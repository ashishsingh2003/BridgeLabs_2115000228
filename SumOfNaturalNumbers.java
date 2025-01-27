import java.util.*;
public class SumOfNaturalNumbers
{
    public int sumOfNaturalNumber(int n){
        return (n*(n+1))/2;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumOfNaturalNumbers obj=new SumOfNaturalNumbers() ;
		int sum=obj.sumOfNaturalNumber(n);
		System.out.print(sum);
		
	}
}