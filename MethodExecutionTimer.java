import java.lang.reflect.Method;

class MathUtils {
    public void compute() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Computation Done!");
    }
}

public class MethodExecutionTimer {
    public static void main(String[] args) throws Exception {
        MathUtils obj = new MathUtils();
        Method method = MathUtils.class.getMethod("compute");

        long startTime = System.nanoTime();
        method.invoke(obj);
        long endTime = System.nanoTime();

        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

