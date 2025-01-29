import java.util.*;
public class LongestWord{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder();
		String st[]=str.split(" ");
		boolean flag[]=new boolean[st.length];
		int maxi=Integer.MIN_VALUE;
		
		for(int i=0;i<st.length;i++){
			String s=st[i];
			if(maxi<s.length())
			{
				sb.delete(0,sb.length());
				sb.append(s);
			}
			
			
		}
		System.out.print(sb);
		
			
	}
}