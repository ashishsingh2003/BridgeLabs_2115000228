import java.util.*;
public class ReverseString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    String str2="";
		for(int i=str.length()-1;i>=0;i--){
			str2+=str.charAt(i);
		}
		System.out.print(str2);
	}
}