import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class BugTracker {
    @BugReport(description = "Null pointer exception occurs intermittently")
    @BugReport(description = "Performance issue when processing large data")
    void trackBugs() {
        System.out.println("Tracking bugs");
    }
}

public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        BugTracker bugTracker = new BugTracker();
        Method method = bugTracker.getClass().getMethod("trackBugs");
        
        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug: " + bugReport.description());
            }
        }
    }
}

