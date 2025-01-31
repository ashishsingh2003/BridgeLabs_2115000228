class EmployeeClass{
	private String name;
	private int salary;
	private int id;
	public EmployeeClass(String name,int id,int salary)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public void display()
	{
		System.out.println(name+" "+id+" "+salary);
	}
	
}
public class Employee{
	public static void main(String[] args)
	{
		EmployeeClass emp=new EmployeeClass("Ashish",1,70000);
		emp.display();
	}
}