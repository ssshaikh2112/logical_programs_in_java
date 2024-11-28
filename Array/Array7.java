import java.util.Arrays;
class Array7
{
	public static void main(String[] args) 
	{

		int[][][] arr=new int[2][][];
		arr[0]=new int[2][];
		arr[1]=new int[3][];

		arr[0][0]=new int[2];
		arr[0][1]=new int[3];

		arr[1][0]=new int[2];
		arr[1][1]=new int[3];
		arr[1][2]=new int[3];


		arr[0][0][0]=10;
		arr[0][0][1]=20;

		arr[0][1][0]=30;
		arr[0][1][1]=40;
		arr[0][1][2]=50;

		arr[1][0][0]=60;
		arr[1][0][1]=70;

		arr[1][1][0]=80;
		arr[1][1][1]=90;
		arr[1][1][2]=100;

		arr[1][2][0]=110;
		arr[1][2][1]=120;
		arr[1][2][2]=130;


		System.out.println(Arrays.deepToString(arr));	//[[[10, 20], [30, 40, 50]], [[60, 70], [80, 90, 100], [110, 120, 130]]]
	}
}