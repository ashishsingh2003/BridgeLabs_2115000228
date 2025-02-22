import java.util.regex.*;

public class BadWordCensor {
    public static String censorBadWords(String text, String[] badWords) {
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        System.out.println(censorBadWords(text, badWords));
    }
}

