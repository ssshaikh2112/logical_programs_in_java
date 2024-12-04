import java.util.*;
class ArrayRotationAntiClockWise
{
	public static void main(String[] args) 
	{
		int[] array={1,2,3,4,5,6};
		System.out.println(Arrays.toString(array));

		int rotation =3;					// how many rotations are needed
		for (int i=1;i<=rotation ;i++ ) 	// how many rotation happens
		{
			int temp=array[array.length-1];				// temp = 6
			for (int j=array.length-1;j>0 ;j-- ) 
			{
				array[j]=array[j-1];		// array[5]=5 , array[4]=4 , ...
			}
			array[0]=temp;		// array[0]=6
		}
		System.out.println(Arrays.toString(array));
	}
}