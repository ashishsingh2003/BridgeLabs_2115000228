
import java.util.*;
public class SumOfNaturalNumberRecursive
{
    public static long sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        long ans=0;
        ans=n+sum(n-1);
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long s=sum(n);
		long compsum=(n*(n+1))/2;
		System.out.print(s+" is equal to n*(n+1)/2 's result"+ compsum);
	}
}

