import java.util.*;
class BubbleSortAccendingString
{
	public static void main(String[] args) 
	{
		String [] array={"C","H","B","E","A","D"};
		System.out.println(Arrays.toString(array));
		bubbleAccending(array);
		//Arrays.sort(array);	build in method
		System.out.println(Arrays.toString(array));

	}
	public static void bubbleAccending(String[] array)
	{
		for (int i=0;i<array.length ;i++ ) 
		{
			for (int j=i+1;j<array.length ;j++ ) 
			{
				if (array[i].compareTo(array[j])>0) 
				{
					String temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}