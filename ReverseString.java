import java.util.*;
public class ReverseString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
			sb.append(ch);
		}
		System.out.print(sb);
	}
}