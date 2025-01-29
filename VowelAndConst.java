import java.util.*;
public class VowelAndConst{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int countvowel=0;
		int countconst=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='i')
			{
				countvowel++;
			}
			else{
				countconst++;
			}
		}
		System.out.print("The number of vowel in string is "+countvowel+" and consonant is "+countconst);
	}
}