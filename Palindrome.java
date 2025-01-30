import java.util.*;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    String str2="";
		for(int i=str.length()-1;i>=0;i--){
			str2+=str.charAt(i);
		}
		
		if(str.equals(str2))
		{
			System.out.print("Palindrome");
		}
		else{
			System.out.print("Not Palindrome");
		}
	}
}