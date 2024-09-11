import java.util.Scanner;
class AutomorphicNumber
{

/*
squares last  digit == original number is called  AutomorphicNumber
5776==76
25==5
*/	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number =scan.nextInt();
		int sqr=number*number;
		int count = 0;
		int duplicate = number;

		while(number>0)
		{
			count++;
			number/=10;
		}
	//	System.out.print(count);
		int div = 1;
		for (int i=1;i<=count ;i++ ) 
			div*=10;

	//	System.out.print(div);
		System.out.print(((sqr%div)==duplicate)?((duplicate+" is a AutomorphicNumber")):((duplicate+" is not a AutomorphicNumber")));
	}
}