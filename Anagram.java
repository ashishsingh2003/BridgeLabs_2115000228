import java.util.*;
public class Anagram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		int flag=0;
        if(str1.length()!=str2.length())
		{
			System.out.print("Not Anagram");
		}
		else{
			str1.trim();
			str2.trim();
			char arr1[]= str1.toCharArray();
			char arr2[]=str1.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<str1.length();i++)
			{
				if(arr1[i]!=arr2[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print("Anagram");
			}
			else{
				System.out.print("Not Anagram");
			}
		}	
	}
}