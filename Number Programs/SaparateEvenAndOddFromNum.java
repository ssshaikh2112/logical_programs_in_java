import java.util.Scanner;
class SaparateEvenAndOddFromNum
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = scan.nextInt();
		
		String even="";
		String odd="";
		for (int i=number;i>0 ;i/=10 ) 
		{
			int rem=i%10;
			if(rem%2==0)
				even=rem+even;
			else
				odd=rem+odd;
		}

		System.out.print(odd+even);

	}
}