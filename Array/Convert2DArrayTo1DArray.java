import java.util.*;
class Convert2DArrayTo1DArray
{
	public static void main(String[] args) 
	{
		int [][] twoDimensionalArray={{1,2,3},{4,5,6,},{7,8,9},{12,15,11}};
	//	System.out.println(Arrays.deepToString(twoDimensionalArray.length));
		int [] oneDimensionalArray=new int[twoDimensionalArray.length*twoDimensionalArray[0].length];
		int index=0;
		// System.out.println(twoDimensionalArray[0].length); -->	3
		for (int[] num:twoDimensionalArray ) 
		{
			for (int oneDnum :num ) {
				oneDimensionalArray[index++]=oneDnum;
			}
		}
		System.out.println(Arrays.toString(oneDimensionalArray));
	}
}