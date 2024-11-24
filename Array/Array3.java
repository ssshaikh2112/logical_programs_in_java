import java.util.Arrays;
class Array3
{
	public static void main(String[] args) 
	{
		String[][] arr= new String[2][2];
		arr[0][0]="Jonas";
		arr[0][1]="Martha";
		arr[1][0]="Mikkel";
		arr[1][1]="Urich";
		System.out.println(Arrays.deepToString(arr));	//[[Jonas, Martha], [Mikkel, Urich]]
	}
}