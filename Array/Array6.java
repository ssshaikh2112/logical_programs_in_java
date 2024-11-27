import java.util.Arrays;
class Array6
{
	public static void main(String[] args) 
	{
		boolean[][] arr = new boolean[2][];
		arr[0]=new boolean[2];
		arr[1]=new boolean[3];
		System.out.println(Arrays.deepToString(arr));	//[[false, false], [false, false, false]]
		arr[0][0]=true;
		arr[0][1]=true;
		arr[1][0]=true;
		arr[1][1]=true;
		arr[1][2]=true;
		System.out.println(Arrays.deepToString(arr));	//[[true, true], [true, true, true]]

	}
}