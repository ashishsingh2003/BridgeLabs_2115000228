import java.lang.reflect.Method;

// Invoke Private Method
public class MathOperations {
    private int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(mathOperations, 7, 8);
        System.out.println("Multiplication Result: " + result);
    }
}

