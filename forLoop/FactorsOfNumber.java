import java.util.Scanner;
class FactorsOfNumber
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Number : ");
		int number= scan.nextInt();

		System.out.print("Factors of "+number+" : ");
		for (int i=1;i<=number ;i++ ) 
		{
			if(number%i==0)
				System.out.print(i+" ");
			
		}
	}
}