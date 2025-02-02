class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void modifySalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void displayInfo() {
        employeeID = 101;
        department = "HR";
        modifySalary(75000.00);

        System.out.println("Employee ID " + employeeID);
        System.out.println("Department " + department);
        System.out.println("Salary" + getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.displayInfo();
    }
}

