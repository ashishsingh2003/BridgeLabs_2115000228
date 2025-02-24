import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class AnnotatedClass {}

public class AnnotationRetriever {
    public static void main(String[] args) {
        Class<AnnotatedClass> obj = AnnotatedClass.class;
        if (obj.isAnnotationPresent(Author.class)) {
            Author annotation = obj.getAnnotation(Author.class);
            System.out.println("Author: " + annotation.name());
        }
    }
}

