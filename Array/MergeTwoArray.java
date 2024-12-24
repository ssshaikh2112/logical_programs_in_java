import java.util.*;
class MergeTwoArray
{
	public static void main(String[] args) 
	{
		int [] array1={10,20,30,40};
		int [] array2={50,60,70,80,90,100};

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		int [] mergeArray=new int[array1.length+array2.length];	// specify the total length of merge array
		System.out.println(Arrays.toString(mergeArray));

		for (int i=0 , array2Index=0;i<mergeArray.length ;i++ ) 
		{
			if (array1.length>i) 
			{
				mergeArray[i]=array1[i];
			}
			else
				mergeArray[i]=array2[array2Index++];
		}
		System.out.println(Arrays.toString(mergeArray));


	}
}