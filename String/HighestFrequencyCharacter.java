public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        String input = "success";

        char highestFrequencyChar = findHighestFrequencyChar(input);
        System.out.println("The character with the highest frequency is: " + highestFrequencyChar);
    }

    public static char findHighestFrequencyChar(String str) {
        int maxFrequency = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }

            // Update the character with the highest frequency
            if (count > maxFrequency) {
                maxFrequency = count;
                maxChar = currentChar;
            }
        }

        return maxChar;
    }
}
