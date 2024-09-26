import java.util.Scanner;
class PowerOfNumber
{

//Find a power of a number
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number=scan.nextInt();
		System.out.print("Enter power : ");
		int power=scan.nextInt();
		int output=1;

		for (int i=1;i<=power ;i++ ) 
			output*=number;
		System.out.println("output : "+output);
	}
}