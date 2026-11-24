package arrays;

public class Arrays78CharDontChangePosiAfterReverse 
{

	public static void main(String[] args) 
	{
		String str="alphxxdida";
		
		int count=0;
		for (int i = 0 , j=str.length()-1; i < str.length(); i++ ,j--) {
			if(str.charAt(i)==str.charAt(j))
			{
				count++;
				
			}	
		}
		System.out.println(count);
	}
}
