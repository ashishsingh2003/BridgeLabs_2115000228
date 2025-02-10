import java.util.*;
abstract class Employee{
   protected int employeeId;
   protected String name;
   protected int baseSalary;
   abstract public int calculateSalary(int salary,int work);
   public void displayDetails(){   
       System.out.println(employeeId);
	   System.out.println(name);
	   System.out.println(baseSalary);
   }
}
interface Department{
   public void assignDepartment(String Department);
   public String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
    String department;
	FullTimeEmployee(int employeeId,String name,int baseSalary)
	{
	     this.employeeId=employeeId;
		 this.name=name;
		 this.baseSalary=baseSalary;
		 
	}
	public void assignDepartment(String department)
    {
		this.department=department;
    }
	public int calculateSalary(int salary,int work)
	{
		
	   return salary;
	}
	public String getDepartmentDetails()
    {
	     return this.department;
    }
}
class PartTimeEmployee extends Employee implements Department{
    String department;
	PartTimeEmployee(int employeeId,String name,int baseSalary)
	{
	     this.employeeId=employeeId;
		 this.name=name;
		 this.baseSalary=baseSalary;
		 
	}
	public void assignDepartment(String department)
    {
		this.department=department;
    }
	public int calculateSalary(int salaryPerHour,int workPerHour)
	{
	   this.baseSalary=workPerHour*salaryPerHour;
	   return workPerHour*salaryPerHour;
	}
	public String getDepartmentDetails()
    {
	     return this.department;
    }
}
public class EmployeeManagementSystem{
	public static void main(String[] args)
	{
		FullTimeEmployee emp=new FullTimeEmployee(1,"Ashish Singh",4000000);
		emp.displayDetails();
		emp.assignDepartment("IAS");
		System.out.println(emp.getDepartmentDetails());
	}
}

