import java.util.*;

abstract class CourseType {
    private String name;
    
    public CourseType(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-Based");
    }
}

class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }
}

class University {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Type: " + course.getCourseType().getName());
        }
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> history = new Course<>("History", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics Research", new ResearchCourse());

        University university = new University();
        university.addCourse(math);
        university.addCourse(history);
        university.addCourse(physics);

        university.showCourses();
    }
}
