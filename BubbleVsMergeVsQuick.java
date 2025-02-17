import java.util.*;
public class BubbleVsMergeVsQuick{
    public static void merge(int arr[],int start,int mid,int end)
	{
	
	    int left[]=new int[mid-start+1];
		int right[]=new int[end-mid];
		int i=0,k=0;
		for( i=0;i<left.length;i++)
		{
			left[i]=arr[i+start];
		}
		for( i=0;i<right.length;i++)
		{
			right[i]=arr[i+mid+1];
		}
		int j=0;
		k=start;
		i=0;
		while(i<left.length&&j<right.length)
		{
			if(left[i]<=right[j])
			{
				arr[k++]=left[i];
				i++;
			}
			else{
				arr[k++]=right[j];
				j++;
			}
			
		}
		while(i<left.length)
		{
			arr[k++]=left[i];
			i++;
		}
		while(j<right.length)
		{
			arr[k++]=right[j];
			j++;
		}
		return ;
	}
    public static void mergeSortArray(int arr[],int start,int end)
	{
		if(end>start)
		{
			
		
		int mid=start+(end-start)/2;
		mergeSortArray(arr,start,mid);
		mergeSortArray(arr,mid+1,end);
	    merge(arr,start,mid,end);
		}
		return;
	}
	public static int partition(int arr[],int start,int end)
	{
		int pivot=arr[end];
		int i=start;
		
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		return i;
	}
	public static void quickSortArray(int arr[],int start,int high)
	{
		if(high>start)
		{	
			int pi=partition(arr,start,high);
			quickSortArray(arr,start,pi-1);
			quickSortArray(arr,pi+1,high);
		
		}
		return;
	}
    public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{ 
		    for(int j=i+1;j<arr.length-i;j++)
			{
			    if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return;
	}
	public static void mergeSort(int arr[])
	{
		mergeSortArray(arr,0,arr.length-1);
		return ;
	}
	public static void quickSort(int arr[])
	{
		quickSortArray(arr,0,arr.length-1);
		return;
	}
	public static void main(String[] args){
		int arr[]=new int[1000];
		int arr2[]=new int[1000];
		int arr3[]=new int[1000];
		Random random=new Random();
		for(int i=0;i<1000;i++)
		{
			arr[i]=random.nextInt(1000);
			arr2[i]=arr[i];
			arr3[i]=arr[i];
		}
		long start=System.nanoTime();
		bubbleSort(arr);
		long end=System.nanoTime()-start;
		System.out.println("The time for bubble sort is: "+ end);
	 
		arr=arr2;
		
		start=System.nanoTime();
		mergeSort(arr);
		end=System.nanoTime()-start;
		System.out.println("The time for merge sort is: "+ end);
		
		
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		start=System.nanoTime();
		quickSort(arr3);
		end=System.nanoTime()-start;
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("The time for quick2 sort is: "+ end);
		
	
		
	}
}
