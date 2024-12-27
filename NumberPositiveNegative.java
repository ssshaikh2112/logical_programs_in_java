import java.util.Scanner;

class NumberPositiveNegative
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = scan.nextInt();

		if(number>0)
		{
			System.out.println("Number is Positive and Number is : "+number);
		}
		else if(number<0)
		{
			System.out.println("Number is Negative and Number is : "+number);
		}
		else
		{
			System.out.println("Number is NEUTRAL and Number is : "+number);
		}

			
	}
}
