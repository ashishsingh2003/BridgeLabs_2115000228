import java.util.regex.*;
import java.util.*;

public class RepeatingWordsFinder {
    public static Set<String> findRepeatingWords(String text) {
        Set<String> repeatingWords = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b(?:\\s+\\1\\b)").matcher(text);
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        System.out.println(findRepeatingWords(text)); // [is, repeated]
    }
}

