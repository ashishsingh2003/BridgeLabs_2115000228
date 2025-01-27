import java.util.*;
public class ChocolateDistribution{

    public int[] chocolateDistribution(int a,int b){
        int arr[]=new int[2];
        arr[0]=a%b;
        arr[1]=a/b;
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		ChocolateDistribution obj=new  ChocolateDistribution() ;
		int arr[]=obj.chocolateDistribution(a,b);
		System.out.print("Each children will get "+arr[1]+ " chocolates and the remainder is "+ arr[0]);
	}
}

