import java.util.*;
class MergeTwoArrayZigZakWay
{
	public static void main(String[] args) 
	{
		int [] array1 = {10,20,30,40,50};
		int [] array2 = {80,100,110};

		int [] mergeArray=new int[array1.length+array2.length];	// specify the total length of merge array
		System.out.println(Arrays.toString(mergeArray));

		for (int i=0 , mergeArrayIndex=0;i<array1.length ;i++ ) 
		{
			mergeArray[mergeArrayIndex++]=array1[i];		//	
			if (array2.length>i) 
				mergeArray[mergeArrayIndex++]=array2[i];
		}
		System.out.println(Arrays.toString(mergeArray));
	}

}