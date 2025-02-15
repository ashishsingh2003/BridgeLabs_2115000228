public class LinearSearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "The sky is blue.",
            "I love programming.",
            "Java is a powerful language.",
            "This is a test sentence."
        };
        String word = "java";

        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing \"" + word + "\": " + result);
    }
}

