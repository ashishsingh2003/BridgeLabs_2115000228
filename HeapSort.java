import java.util.*;
public class HeapSort{
	public static void heapify(int arr[],int i,int n)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n&&arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<n&&arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
		    int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,largest,n);
		}
		return ;
	}
	public static void main(String[] args)
	{
		int arr[]={2,5,6,7,1,3,4};
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,i,n);
		}
		for(int i=n-1;i>0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,0,i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
}