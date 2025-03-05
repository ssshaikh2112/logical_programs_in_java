public class DistinctWordsInSentence {
    public static void main(String[] args) {
        String input = "hello world hello java world";

        String distinctWords = findDistinctWords(input);
        System.out.println("The distinct words in the sentence are: " + distinctWords);
    }

    public static String findDistinctWords(String str) {
        String[] words = str.split(" "); // Split the sentence into words
        StringBuilder distinct = new StringBuilder();

        for (String word : words) {
            // Check if the word is not already added to the result
            if (!distinct.toString().contains(word)) {
                if (distinct.length() > 0) {
                    distinct.append(" "); // Add space between words
                }
                distinct.append(word); // Add the word to the result
            }
        }

        return distinct.toString();
    }
}
