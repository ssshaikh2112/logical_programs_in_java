import java.util.*;
class BubbleSortAccending
{
	public static void main(String[] args) 
	{
		int [] array={7,3,8,1,5,9,4,6,2};
		System.out.println(Arrays.toString(array));
		bubbleAccending(array);
		System.out.println(Arrays.toString(array));

	}
	public static void bubbleAccending(int[] array)
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
	}
}