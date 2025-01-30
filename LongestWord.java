import java.util.*;
public class LongestWord{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2="";
		int maxi=Integer.MIN_VALUE;
		int cnt=0;
		int i=0;
		int j=0;
		int ind1=0;
		int ind2=0;
		
		while(j<str.length())
		{
			if(str.charAt(j)==' ')
			{
				if(maxi<j-i)
				{
					maxi=j-i;
					ind1=i;
					ind2=j-1;
					
				}
				i=j+1;
				j=i;
				continue;
			}
			else{
				j++;
			}
				
				
		}
		if(maxi<j-i)
		{
			maxi=j-i;
			ind1=i;
			ind2=j-1;
		}
        for( i=ind1;i<=ind2;i++)
		{
			str2+=str.charAt(i);
		}
		System.out.print(str2);
		
			
	}
}