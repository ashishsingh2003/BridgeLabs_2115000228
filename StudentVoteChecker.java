import java.util.*;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if(age<0||age<18)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int student[]=new int[10];
        int index=0;
        for(int i=0;i<10;i++)
        {
            
            student[index++]=sc.nextInt();
        }
        StudentVoteChecker obj=new  StudentVoteChecker();
        for(int i=0;i<10;i++)
        {
            boolean vote=obj.canStudentVote(student[i]);
            System.out.println("Student "+(i+1)+" can not vote");
        }
    }
}
