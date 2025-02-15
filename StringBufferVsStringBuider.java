public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        long startTime, endTime;

        // Measure StringBuffer time
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure StringBuilder time
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

