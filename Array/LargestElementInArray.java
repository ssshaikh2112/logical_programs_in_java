import java.util.*;
class LargestElementInArray
{
	public static void main(String[] args) 
	{
		int[] array =new int[10];
		for (int i=1 , index=0;i<=10 ;i++ ) 
		{
			int num=(int)(Math.random()*1000);
			if (num>100) 
			{
				array[index++]=num;
			}
			else
				i--;
		}
		System.out.println(Arrays.toString(array));
		int largestElement=Integer.MIN_VALUE;
		for (int element :array ) 
		{
			if (largestElement<element) 
			{
				largestElement=element;
			}
		}
		System.out.println(largestElement);

	}
}