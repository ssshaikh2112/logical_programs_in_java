import java.util.*;
class FindEvenOddAndMakeArray
{
	public static void main(String[] args) 
	{
		int [] arr ={1,2,3,4,5,6,7,8,9};
		int evenLenth=0;
		int oddLength=0;

		for (int element :arr ) 
		{
			if (element%2==0) 
				evenLenth++;		// if element even then length is increament
			else
				oddLength++;		// if element odd then length is increament
		}
		int[] evenArray=new int [evenLenth];
		int[] oddArray=new int [oddLength];

		for (int i=0 , evenIndex=0 , oddIndex=0;i<arr.length ;i++ )
		{
			if (arr[i]%2==0) 
			{
				evenArray[evenIndex++]=arr[i];
			}
			else
				oddArray[oddIndex++]=arr[i];
		}
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));


	}
}