
import java.util.*;
public class LargestAndSmallest{

    public int[] largestAndSmallest(int a,int b,int c){
        int arr[]=new int[2];
        if(a<c&&a<b)
        {
           arr[0]=a;
            if(c>b)
            {
                arr[1]=c;
            }
            else{
                arr[1]=b;
            }
        }
        else if(b<a&&b<c)
        {
            arr[0]=b;
            if(a>c)
            {
                arr[1]=a;
            }
            else{
                arr[1]=c;
            }
        }
        else{
             arr[0]=c;
            if(a>b)
            {
                arr[1]=a;
            }
            else{
               arr[1]=b;
            }
        }
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		LargestAndSmallest obj=new LargestAndSmallest() ;
		int arr[]=obj.largestAndSmallest(a,b,c);
		System.out.print("The largest number is "+arr[1]+ " and the smallest number is"+ arr[0]);
	}
}


