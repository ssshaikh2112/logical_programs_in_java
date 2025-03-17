public class UniqueWordsInSentence {
    public static void main(String[] args) {
        String input = "hello world hello java world";

        String uniqueWords = findUniqueWords(input);
        System.out.println("The unique words in the sentence are: " + uniqueWords);
    }

    public static String findUniqueWords(String str) {
        String[] words = str.split(" ");
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (str.indexOf(words[i]) == str.lastIndexOf(words[i]) && unique.indexOf(words[i]) == -1) {
                unique.append(words[i]).append(" ");
            }
        }

        return unique.toString().trim();
    }
}
