import java.util.*;
class SchoolClass {
    private String name;
    private List<Student> students;

    publicSchoolClass(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class School {
    public static void main(String[] args) {
       SchoolClassSchoolClass = newSchoolClass("ABC HighSchoolClass");
        
        Student student1 = new Student("Ashish");
        Student student2 = new Student("Prashant");
        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        
        student1.enroll(math);
        student1.enroll(science);
        student2.enroll(math);
        
       SchoolClass.addStudent(student1);
       SchoolClass.addStudent(student2);
        
        System.out.println("Ashish's Courses: ");
        for (Course course : student1.getCourses()) {
            System.out.println(course.title);
        }
        
        System.out.println("Mathematics Enrolled Students: ");
        for (Student student : math.getStudents()) {
            System.out.println(student.name);
        }
    }
}
