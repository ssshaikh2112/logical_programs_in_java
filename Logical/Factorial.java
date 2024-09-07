import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the NUmber : ");
		int number = scan.nextInt();
		System.out.println();
		int fact=1;
		for (int i=number;i>0 ;i-- ) 
		{
			fact*=i;
		}
		System.out.println("Factorial is : "+fact);

	}
}