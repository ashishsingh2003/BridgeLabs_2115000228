public class FibonacciComparison {
    public static void main(String[] args) {
        compareFibonacciMethods(40);
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int iterativeFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void compareFibonacciMethods(int n) {
        long startTime = System.nanoTime();
        System.out.println("Recursive Fibonacci(" + n + "): " + recursiveFibonacci(n));
        long endTime = System.nanoTime();
        System.out.println("Recursive Time: " + (endTime - startTime) / 1e6 + " ms");
        
        startTime = System.nanoTime();
        System.out.println("Iterative Fibonacci(" + n + "): " + iterativeFibonacci(n));
        endTime = System.nanoTime();
        System.out.println("Iterative Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

