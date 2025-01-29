import java.util.*;
public class CompareString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
	    String str2=sc.next();
		StringBuilder sb=new StringBuilder();
		int i=0;
		int j=0;
		int flag=0;
		while(i<str1.length()&&j<str2.length())
		{
			int x=(int)str1.charAt(i);
			int y=(int)str2.charAt(j);
		
			if(x<y)
			{
				System.out.print(str1+" comes before "+str2);
				flag=1;
				break;
			}
			else if(x==y)
			{
				
				i++;
				j++;
				continue;
			}
			else if(y<x){
				System.out.print(str2+" comes before "+str1);
				flag=1;
				break;
			}
			i++;
			j++;
		
		}
		if(flag==0&&str1.length()>str2.length())
		{
			System.out.print(str2);
		}
		if(flag==0&&str2.length()>str1.length())
		{
			System.out.print(str1);
		}
		
		
		
			
	}
}