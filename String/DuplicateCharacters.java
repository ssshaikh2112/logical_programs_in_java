public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "success";

        String duplicates = findDuplicateCharacters(input);
        System.out.println("The duplicate characters in the word are: " + duplicates);
    }

    public static String findDuplicateCharacters(String str) {
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check for duplicates only if the character is not already added
            if (duplicates.indexOf(String.valueOf(currentChar)) == -1 && 
                str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                duplicates.append(currentChar);
            }
        }

        return duplicates.toString();
    }
}
