import java.util.*;
class EmployeeManagementClass{
    static String companyName="Capgemini";
	String name;
	String designation;
	final int id;
	static int totalEmployees=0;
	public EmployeeManagementClass(String name,String designation,int id)
	{
	   this.name=name;
	   this.designation=designation;
	   this.id=id;
	   totalEmployees++;
	}
	public static int displayTotalEmployees()
	{
	   return totalEmployees;
	}
	public void displayDetails()
	{
	     System.out.println(this.name);
		 System.out.println(this.designation);
		 System.out.println(this.id);
	}
}
public class EmployeeManagement{
      public static void main(String[] args)
	  {
	     EmployeeManagementClass obj=new EmployeeManagementClass("Ashish Singh","Software Engineer",1);
	     if(obj instanceof EmployeeManagementClass)
		 {
		    System.out.println(obj.displayTotalEmployees());
			obj.displayDetails();
		 }
	  }
}