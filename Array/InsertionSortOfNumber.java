import java.util.*;

class InsertionSortOfNumber
{
	// Incomplete wrong
	public static void main(String[] args) 
	{
		int [] array= {5,6,2,7,1,9,4,3,8};
		System.out.println(Arrays.toString(array));


		for (int i=0;i<array.length ;i++ ) 
		{
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;

				j--;
			}
			
		}
		System.out.println(Arrays.toString(array));

	}
}