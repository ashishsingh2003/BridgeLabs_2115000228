import java.util.*;
public class YoungestAndTallest2
{
    public static int[] tallestAndYoungest(int Age[],int Height[])
    {
        int []index=new int[2];
        if(Age[0]<=Age[1]&&Age[0]<=Age[2])
        {
            index[0]=0;
        }
        else if(Age[1]<=Age[0]&&Age[1]<=Age[2])
        {
            index[0]=1;
        }
        else{
            index[0]=2;
        }
        if(Height[0]>=Height[1]&&Height[0]>=Height[2])
        {
            index[1]=0;
        }
        else if(Height[1]>=Height[0]&&Height[1]>=Height[2])
        {
            index[1]=1;
        }
        else{
            index[1]=2;
        }
        
        return index;
        
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int Age[]=new int[3];
		int Height[]=new int[3];
		String str[]={"Amar","Akbar","Anthony"};
		System.out.println("Enter Age");
		
		for(int i=0;i<3;i++)
		{
		    Age[i]=sc.nextInt();
		}
		System.out.println("Enter height");
		
		for(int i=0;i<3;i++)
		{
		    Height[i]=sc.nextInt();
		}
		
		int []arr=tallestAndYoungest(Age,Height);
		System.out.print("Youngest is "+str[arr[0]]+" Tallest is "+str[arr[1]]);
		
	}
}

