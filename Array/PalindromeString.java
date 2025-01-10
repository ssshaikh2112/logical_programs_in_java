import java.util.*;
class PalindromeString
{
	public static void main(String[] args) 
	{
		String[] array = {"NAMAN" , "JONAS" , "SAMAS" , "MARTHA"};
		System.out.println(Arrays.toString(array));
		for (String str :array ) {
			if (isPalindrome(str)) {
				System.out.println(str);
			}
		}
	}

	public static boolean isPalindrome(String str) 
	{
        String reversed = "";
        // Manually reverse the string
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversed += str.charAt(i);
        }
        // Check if the original string equals the reversed string
         return (str.equals(reversed));
    }
}