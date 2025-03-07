public class DuplicateWordsInSentence {
    public static void main(String[] args) {
        String input = "hello world hello java world";

        String duplicates = findDuplicateWords(input);
        System.out.println("The duplicate words in the sentence are: " + duplicates);
    }

    public static String findDuplicateWords(String str) {
        String[] words = str.split(" ");
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (str.indexOf(words[i]) != str.lastIndexOf(words[i]) && duplicates.indexOf(words[i]) == -1) {
                duplicates.append(words[i]).append(" ");
            }
        }

        return duplicates.toString().trim();
    }
}
