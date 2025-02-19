import java.util.*;
public class ReverseList{
	public static void main(String[] args)
	{
		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		for(int i=a.size()-1;i>=0;i--)
		{
			System.out.print(a.get(i));
		}
		System.out.println();
		LinkedList<Integer>l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i));
		}
	}
	
}