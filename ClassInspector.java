import java.lang.reflect.*;
import java.util.Scanner;

// Get Class Information
public class ClassInspector {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();
        Class<?> cls = Class.forName(className);
        
        System.out.println("Class: " + cls.getName());
        
        System.out.println("Methods:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }
        
        System.out.println("Fields:");
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }
        
        System.out.println("Constructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}

// Access Private Field
class Person {
    private int age = 30;

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Original Age: " + field.get(person));
        field.set(person, 40);
        System.out.println("Modified Age: " + field.get(person));
    }
}

