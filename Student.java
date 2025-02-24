import java.lang.reflect.Constructor;

// Dynamically Create Objects
public class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getDeclaredConstructor();
        Student student = constructor.newInstance();
        student.display();
    }
}

