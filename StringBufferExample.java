public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(50);
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());
    }
}

