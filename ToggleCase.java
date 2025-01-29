import java.util.*;
public class ToggleCase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	    StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			int ascii=(int)ch;
			if(ascii>=97&&ascii<=122)
			{
				sb.append((char)(ascii-32));
			}
			else{
				sb.append((char)(ascii+32));
			}
			
		}
		System.out.print(sb);
		
			
	}
}