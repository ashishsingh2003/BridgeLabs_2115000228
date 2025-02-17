import java.util.*;
public class StringVsStringBuilderVsStringBuffer{
	public static void main(String[] args)
	{
	String s1="Ashish";
	StringBuilder sb=new StringBuilder("Ashish");
	StringBuffer sbr=new StringBuffer("Ashish");
	
	long start=System.nanoTime();
	s1.concat("Singh");
	long end=System.nanoTime()-start;
	System.out.println("The time for String is: "+ end);
	
	start=System.nanoTime();
	sb.append("Singh");
	end=System.nanoTime()-start;
	System.out.println("The time for StringBuilder is: "+ end);
	
	start=System.nanoTime();
	sbr.append("Singh");
	end=System.nanoTime()-start;
	System.out.println("The time for StringBuffer is: "+ end);
	}
}
