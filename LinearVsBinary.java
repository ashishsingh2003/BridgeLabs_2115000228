import java.util.*;
public class LinearVsBinary{
	public static void linearSearch(int arr[],int data)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==data)
			{
				return;
			}
		}
		return;
	}
	public static void binarySearch(int arr[],int data)
	{
		int s=0,e=arr.length-1;
		
		while(s<e)
		{
			int mid=s+(e-s)/2;
			if(arr[mid]==data)
			{
				return;
			}
			else if(arr[mid]>data)
			{
				e=mid-1;
			}
			else{
			s=mid+1;}
		}
		return;
	}
	public static void main(String[] args)
	{
	    int arr[]=new int[1000];
		Random random=new Random();
		for(int i=0;i<1000;i++)
		{
			arr[i]=random.nextInt(1000);
		}
		Arrays.sort(arr);
		int data=78;
		long start=System.nanoTime();
		linearSearch(arr,data);
		long timeForLinear=System.nanoTime()-start;
		System.out.println("Time required for Linear Search: "+timeForLinear);
		
		start=System.nanoTime();
		binarySearch(arr,data);
		long timeForBinary=System.nanoTime()-start;
		System.out.println("Time required for Binary Search: "+timeForBinary);
	}
}
