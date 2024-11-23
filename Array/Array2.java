import java.util.Arrays;
class Array2
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[2][];	// 2D Arrays
		arr[0]=new int[2];
		arr[1]=new int[3];

		arr[0][0]=10;
		arr[0][1]=20;

		arr[1][0]=30;
		arr[1][1]=40;
		arr[1][2]=50;
		System.out.println(Arrays.deepToString(arr));	//[[10, 20], [30, 40, 50]]
	}
}