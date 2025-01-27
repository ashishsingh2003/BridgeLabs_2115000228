import java.util.*;
public class QuotientAndRemainder{

    public int[] quotientAndRemainder(int a,int b){
        int arr[]=new int[2];
        arr[0]=a%b;
        arr[1]=a/b;
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		QuotientAndRemainder obj=new QuotientAndRemainder() ;
		int arr[]=obj.quotientAndRemainder(a,b);
		System.out.print("The Quotient is "+arr[1]+ " and the remainder is "+ arr[0]);
	}
}
