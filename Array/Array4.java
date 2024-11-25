import java.util.Arrays;
class Array4
{
	public static void main(String[] args) 
	{
		String[][] arr=new String[2][];
		arr[0]=new String[1];
		arr[1]=new String[2];

		arr[0][0]="Jonas";
		arr[1][0]="Martha";
		arr[1][1]="Mikkel";
		System.out.println(Arrays.deepToString(arr));	//[[Jonas], [Martha, Mikkel]]
	}
}