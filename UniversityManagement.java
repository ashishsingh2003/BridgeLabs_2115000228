import java.util.ArrayList;

class University {
    ArrayList<Student> students;
    ArrayList<Professor> professors;
    ArrayList<Course> courses;

    public University() {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " has enrolled in " + course.getCourseName());
        courses.add(course);
        course.addStudent(this);
    }
}

class Professor {
    String name;
    ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void assignProfessor(Course course) {
        System.out.println(name + " is teaching " + course.getCourseName());
        courses.add(course);
        course.setProfessor(this);
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student("Prashant");
        Student student2 = new Student("Rasali");

        Professor professor1 = new Professor("Dr. Ashish");
        Professor professor2 = new Professor("Dr. Singh");

        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Mathematics 101");

        university.addStudent(student1);
        university.addStudent(student2);

        university.addProfessor(professor1);
        university.addProfessor(professor2);

        university.addCourse(course1);
        university.addCourse(course2);

        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);
    }
}


