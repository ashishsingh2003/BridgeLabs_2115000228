import java.util.*;
public class StockSpan{
	public static void main(String[] args)
	{
	      int arr[]={5,1,2,4,6};
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
		    
			while(!st.isEmpty()&&arr[st.peek()]<=arr[i])
			{
			    
				st.pop();
			}
			int x=st.isEmpty()? (i+1) : i-st.peek();
			System.out.println(x);
			st.push(i);
		}
		
	}
}

