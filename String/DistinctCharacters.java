public class DistinctCharacters {
    public static void main(String[] args) {
        String input = "success";

        String distinctChars = findDistinctCharacters(input);
        System.out.println("The distinct characters in the word are: " + distinctChars);
    }

    public static String findDistinctCharacters(String str) {
        StringBuilder distinct = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is already added to the result
            if (distinct.indexOf(String.valueOf(currentChar)) == -1) {
                distinct.append(currentChar); // Add to the result if not already present
            }
        }

        return distinct.toString();
    }
}
