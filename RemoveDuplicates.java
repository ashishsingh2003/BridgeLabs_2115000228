import java.util.*;
public class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder(str);
		StringBuilder ans=new StringBuilder();
		sb.reverse();
		
		for(int i=0;i<sb.length();i++){
			char c1=sb.charAt(i);
			int cnt=0;
			for(int j=i+1;j<sb.length();j++){
				char c2=sb.charAt(j);
				if(c1==c2)
				{
					cnt++;
				}
            }
			if(cnt==0){
				ans.append(c1);
			}
			
		}
		ans.reverse();
		System.out.print(ans);
			
	}
}