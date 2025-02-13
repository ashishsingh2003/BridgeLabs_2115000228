import java.util.*;
class Queue{
	Stack<Integer>st;
	Stack<Integer>st2;
	Queue()
	{
	  st=new Stack<>();
	  st2=new Stack<>();
	}
	public void enqueue(int data)
	{
	    while(!st.isEmpty())
		{
			st2.push(st.pop());
		}
		st2.push(data);
		while(!st2.isEmpty())
		{
			st.push(st2.pop());
		}
		   
    }
	public int dequeue()
	{
		int x=st.pop();
		return x;
		
	}
	public int peek()
	{
	   return st.peek();
	}
	public boolean empty(){
	   if(st.size()==0)
	   {
			return true;
	   }
	   return false;
	}
}
public class QueueUsingStack{
	public static void main(String[] args){
	Queue q=new Queue();
	q.enqueue(1);
	q.enqueue(2);
	q.enqueue(3);
	while(!q.empty())
	{
	   System.out.println(q.dequeue());
	}
	}
}
