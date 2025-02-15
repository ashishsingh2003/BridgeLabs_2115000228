public class StringBufferConcatenation {
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Concatenation", " is", " efficient."};
        String result = concatenateStrings(words);
        System.out.println("Concatenated String: " + result);
    }
}

