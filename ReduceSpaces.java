public class ReduceSpaces {
    public static String reduceSpaces(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        String text = "This   is   an   example   with   multiple   spaces.";
        System.out.println(reduceSpaces(text));
    }
}

