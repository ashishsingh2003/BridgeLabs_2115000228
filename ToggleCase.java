import java.util.*;
public class ToggleCase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	    String ans="";
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			int ascii=(int)ch;
			if(ascii>=97&&ascii<=122)
			{
				ans+=((char)(ascii-32));
			}
			else{
				ans+=((char)(ascii+32));
			}
			
		}
		System.out.print(ans);
		
			
	}
}