import java.util.Arrays;
class Array5
{
	public static void main(String[] args) 
	{
		long[][][] arr =new long[2][][];
		arr[0]=new long[2][2];
		arr[1]=new long[1][3];

		arr[0][0][0]=10;
		arr[0][0][1]=20;
		arr[0][1][0]=30;
		arr[0][1][1]=40;
		arr[1][0][0]=50;
		arr[1][0][1]=60;
		System.out.println(Arrays.deepToString(arr));	//[[[10, 20], [30, 40]], [[50, 60, 0]]]

	}
}