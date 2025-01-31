class  Circle{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		double areaofcircle=3.14*radius*radius;
		System.out.println(areaofcircle);
	}
	public void circumference()
	{
		double circumference=3.14*2*radius;
		System.out.println(circumference);
	}
	
}
public class AreaOfCircle{
	public static void main(String[] args)
	{
		Circle circle=new Circle(5);
		circle.area();
		circle.circumference();
	}
}