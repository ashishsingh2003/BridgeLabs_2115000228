import java.util.*;
public class Trigonometry{

    public double[] trigonometry(double degree){
        double arr[]=new double[3];
        double radian=(3.14/180)*degree;
        arr[0]=Math.sin(radian);
        arr[1]=Math.cos(radian);
        arr[2]=Math.tan(radian);
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double degree=sc.nextDouble();
		Trigonometry obj=new Trigonometry() ;
		double arr[]=obj.trigonometry(degree);
		System.out.print("Sine is "+ arr[0]+" Cose id "+arr[1]+" tan is "+ arr[2]);
	}
}
