import java.util.ArrayList;
import java.util.List;

class Faculty {
    String name;
    
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    
    Department(String name) {
        this.name = name;
    }
}

class UniversityClass {
    String name;
    List<Department> departments;
    List<Faculty> faculties;
    
    UniversityClass(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    
    void addDepartment(Department dept) {
        departments.add(dept);
    }
    
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    void closeUniversityClass() {
        departments.clear();
    }
}

public class University {
    public static void main(String[] args) {
        UniversityClass UniversityClass = new UniversityClass("Tech UniversityClass");
        
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");
        
        Faculty profA = new Faculty("Dr. Ashish");
        Faculty profB = new Faculty("Dr. Singh");
        
        UniversityClass.addDepartment(cs);
        UniversityClass.addDepartment(ee);
        
        UniversityClass.addFaculty(profA);
        UniversityClass.addFaculty(profB);
        
        UniversityClass.closeUniversityClass();
        
        System.out.println("Departments after closing UniversityClass: " + UniversityClass.departments.size());
        System.out.println("Faculties still exist: " + UniversityClass.faculties.size());
    }
}
