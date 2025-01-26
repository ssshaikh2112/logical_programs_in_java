import java.util.*;
class UserOneDimensionArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();

		int[] array=new int[size];

		for (int i=0;i<size ;i++ ) 
		{
			int element=sc.nextInt();
			array[i]=element;
		}
		System.out.println(Arrays.toString(array));
	}
}