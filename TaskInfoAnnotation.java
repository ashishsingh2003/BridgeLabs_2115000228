import java.util.ArrayList;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This feature is deprecated");
    }
    
    void newFeature() {
        System.out.println("This is the new feature");
    }
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "John Doe")
    void completeTask() {
        System.out.println("Task completed");
    }
}

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Dog myDog = new Dog();
        myDog.makeSound();
        
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
        
        ArrayList rawList = new ArrayList();
        rawList.add("Unchecked warning suppressed");
        System.out.println(rawList.get(0));
        
        TaskManager taskManager = new TaskManager();
        Method method = taskManager.getClass().getMethod("completeTask");
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}

