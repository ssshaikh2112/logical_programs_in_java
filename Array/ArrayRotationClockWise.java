import java.util.*;
class ArrayRotationClockWise
{
	public static void main(String[] args) 
	{
		int[] array={1,2,3,4,5,6};
		System.out.println(Arrays.toString(array));

		int rotation =3;					// how many rotations are needed
		for (int i=1;i<=rotation ;i++ ) 	// how many rotation happens
		{
			int temp=array[0];				// temp = 1
			for (int j=1;j<array.length ;j++ ) 
			{
				array[j-1]=array[j];		// array[1-1(0)]=1 , array[2-1(1)]=2 , array[3-1(2)]=3...
			}
			array[array.length-1]=temp;		// array[5]=1
		}
		System.out.println(Arrays.toString(array));
	}
}