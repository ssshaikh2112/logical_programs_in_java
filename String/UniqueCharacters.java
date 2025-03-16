public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "success";

        String uniqueChars = findUniqueCharacters(input);
        System.out.println("The unique characters in the word are: " + uniqueChars);
    }

    public static String findUniqueCharacters(String str) {
        StringBuilder unique = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character appears only once
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                unique.append(currentChar);
            }
        }

        return unique.toString();
    }
}
