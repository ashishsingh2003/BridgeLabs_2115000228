import java.util.*;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
			sb.append(ch);
		}
		
		if(str.equals(sb.toString()))
		{
			System.out.print("Palindrome");
		}
		else{
			System.out.print("Not Palindrome");
		}
	}
}