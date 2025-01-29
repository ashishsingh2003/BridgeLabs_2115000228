import java.util.*;
public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        if (sentence == null || oldWord == null || newWord == null || oldWord.isEmpty()) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        int i = 0;
        int len = sentence.length();
        int wordLen = oldWord.length();

        while (i < len) {
            // Check if the substring from i matches oldWord and is a whole word
            if (i + wordLen <= len && sentence.substring(i, i + wordLen).equals(oldWord) &&
                (i == 0 || !Character.isLetterOrDigit(sentence.charAt(i - 1))) &&
                (i + wordLen == len || !Character.isLetterOrDigit(sentence.charAt(i + wordLen)))) {

                result.append(newWord);  // Replace oldWord with newWord
                i += wordLen;  // Move index past the old word
            } else {
                result.append(sentence.charAt(i));  // Append character as is
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
		

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println(result);
    }
}
