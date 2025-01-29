import java.util.*;
public class SubstringOcurrence{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder(str);
		String st[]=str.split(" ");
		boolean flag[]=new boolean[st.length];
		
		for(int i=0;i<st.length;i++){
			String s=st[i];
			int cnt=1;
			if(flag[i]==false){
				flag[i]=true;
				
			for(int j=i+1;j<st.length;j++)
			{
				if(s.equals(st[j]))
				{
					cnt++;
					flag[j]=true;
			     }
			}
			System.out.println(s+" has "+cnt+" ocurrences");
			}
			
		}
		
			
	}
}