import java.util.*;
public class CheckNumber{
        public void checkNumber(int number){
                if(number>0){
			System.out.print("Positive");
		}
		else if(number<0){
			System.out.print("Negative");
		}
		else{
			System.out.print("Zero");
		}
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int number=sc.nextInt();
                CheckNumber obj=new CheckNumber();
                obj.checkNumber(number);
        }
}

