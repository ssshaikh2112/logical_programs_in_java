public class FrequencyOfWordInString 
{
    public static void main(String[] args) 
    {
        String mainString = "hellohellohello";
        String substring = "hello";

        int frequency = findFrequency(mainString, substring);
        System.out.println("The frequency of '" + substring + "' in '" + mainString + "' is: " + frequency);
    }

    public static int findFrequency(String mainString, String substring) 
    {
        int count = 0;

        for (int i = 0; i <= mainString.length() - substring.length(); i++) 
        {
            // Check if substring matches at index `i`
            if (mainString.startsWith(substring, i)) 
            {
                count++;
                i += substring.length() - 1; // Skip the matched part
            }
        }

        return count;
    }
}
