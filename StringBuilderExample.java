public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());
    }
}

