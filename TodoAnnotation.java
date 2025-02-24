import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectTasks {
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    void implementAuth() {
        System.out.println("Auth module pending...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    void optimizeDB() {
        System.out.println("Database optimization pending...");
    }
}

public class TodoAnnotation{
    public static void main(String[] args) {
        ProjectTasks tasks = new ProjectTasks();
        Method[] methods = tasks.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task() + " | Assigned To: " + annotation.assignedTo() + " | Priority: " + annotation.priority());
            }
        }
    }
}

