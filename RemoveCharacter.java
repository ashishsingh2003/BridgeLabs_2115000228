import java.util.*;
public class RemoveCharacter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.next();
	    char ch=str.charAt(0);
		String st="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
			{
				st+=s.charAt(i);
			}
				
		}
		System.out.print(st);
		
			
	}
}