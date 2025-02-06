import java.util.*;
class CompanyClass {
    private String name;
    private List<Department> departments;
    
    public CompanyClass(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    
    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
    
    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Company {
    public static void main(String[] args) {
        CompanyClass CompanyClass = new CompanyClass("TechCorp");
        CompanyClass.addDepartment("IT");
    }
}
