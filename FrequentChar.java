import java.util.*;
public class FrequentChar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
	    
		StringBuilder sb=new StringBuilder();
		int maxi=0;
		boolean flag[]=new boolean[str1.length()];
		
		for(int i=0;i<str1.length();i++)
		{
			int cnt=1;
			
			for(int j=i+1;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					cnt++;
				}
			}
			if(maxi<cnt)
			{
				sb.delete(0,str1.length());
				sb.append(str1.charAt(i));
				maxi=cnt;
			}
		
		}
		System.out.print("The most frequent character is "+sb);
		
			
	}
}