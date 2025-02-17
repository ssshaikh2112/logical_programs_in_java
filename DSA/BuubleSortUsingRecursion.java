package arrays;
import java.util.Arrays;

public class BuubleSortUsingRecursion 
{

	static int i=0;
	public static void main(String[] args) 
	{
		int [] array={7,3,8,1,5,9,4,6,2};
		System.out.println(Arrays.toString(array));
		bubbleAccending(array);
		System.out.println(Arrays.toString(array));

	}
	/*public static void bubbleAccending(int[] array)
	{
		for (int i=0;i<array.length ;i++ ) 
		{
			for (int j=i+1;j<array.length ;j++ ) 
			{
				if (array[i]>array[j]) 
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}*/

	private static void bubbleAccending(int[] array) 
	{
		// TODO Auto-generated method stub
		
		for (int j = i+1; j < array.length; j++)
		{
			if (array[i]>array[j]) 
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
		}
		i++;
		if (i==array.length) 
		{
			return;
		}
		bubbleAccending(array);
	}
	

}
}