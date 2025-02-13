import java.util.*;
public class SortStack{
	public static void sort(Stack<Integer>st,int x)
	{
		if(st.isEmpty()||st.peek()>x)
		{
			st.push(x);
			return;
		}
		int data=st.peek();
		st.pop();
		sort(st,x);
		st.push(data);
	}
	public static void rec(Stack<Integer>st)
	{   if(st.isEmpty())
	     {
			return;
		 }
		int x=st.peek();
		st.pop();
		rec(st);
		sort(st,x);
	}
	public static void main(String[] args)
	{
		Stack<Integer>st=new Stack<>();
		st.push(1);
		st.push(3);
		st.push(2);
		rec(st);
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
	}
}
