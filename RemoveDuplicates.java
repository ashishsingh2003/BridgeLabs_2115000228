import java.util.*;
public class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans="";
	    boolean flag[]=new boolean[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if(flag[i]==false)
			{
				flag[i]=true;
				ans+=str.charAt(i);
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						flag[j]=true;
					}
				}
			}
		}
		
		
		System.out.print(ans);
	}	
	}
