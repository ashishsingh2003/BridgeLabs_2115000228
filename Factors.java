import java.util.*;
public class Factors
{
    public static void factors(int n)
    {
        int factor[]=new int[n];
        int index=0;
	long factorsum=0;
        long factorproduct=1;
        long squarefactorsum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factor[index++]=i;
	        factorsum+=i;
                factorproduct*=i;
                squarefactorsum+=Math.pow(i,2);
            }
        }
      
            System.out.print(factorsum+" "+ factorproduct+ " "+ squarefactorsum);
        
        return;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factors(n);
	}
}

