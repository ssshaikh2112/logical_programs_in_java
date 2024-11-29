import java.util.Arrays;
class Array8
{
	public static void main(String[] args) 
	{
		float[][][] arr=new float[2][2][2];
		arr[0][0][0]=10;
		arr[0][0][1]=10;
		arr[0][1][0]=10;
		arr[0][1][1]=10;
		arr[1][0][0]=10;
		arr[1][0][1]=10;
		arr[1][1][0]=10;
		arr[1][1][1]=10;
		System.out.println(Arrays.deepToString(arr));	//[[[10.0, 10.0], [10.0, 10.0]], [[10.0, 10.0], [10.0, 10.0]]]
	}
}