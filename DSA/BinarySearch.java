package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] arr=new int[20];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
		
		int key=5;
		int position=binarySearch(arr,key);
		System.out.println("Element : "+key+" found at : "+position);
	}

	public static int binarySearch(int[] arr, int key) 
	{
		int start=0;
		int end=arr.length-1;
		while (start<=end) 
		{
			int mid=(start+end)/2;
			if (arr[mid]>key) 
			{
				end=mid-1;
			}
			else if(arr[mid]<key)
			{
				start=mid+1;
			}
			else
				return mid;
		}
		return -1;
	}

}
