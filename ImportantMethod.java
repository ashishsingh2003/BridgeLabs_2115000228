import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class CriticalOperations {
    @ImportantMethod
    void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod(level = "MEDIUM")
    void generateReport() {
        System.out.println("Generating report...");
    }

    void auxiliaryFunction() {
        System.out.println("Auxiliary function executing...");
    }
}

public class ImportantMethod {
    public static void main(String[] args) {
        CriticalOperations operations = new CriticalOperations();
        Method[] methods = operations.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }
}

