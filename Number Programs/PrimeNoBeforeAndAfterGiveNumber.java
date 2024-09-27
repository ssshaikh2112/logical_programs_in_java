import java.util.Scanner;
class PrimeNoBeforeAndAfterGiveNumber
{

/*
ex. 7
5 prime      7       11 prime
distance is 		distance is
2						3
accept 2 (nearest)

15
13 , 17
distance 2
equie distance both print
*/	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=scan.nextInt();
		int prevPrime=0;
		int nextPrime=0;
		
		for (int i=2; ;i++ ) 
		{
			int num2=i;
			boolean flage=true;

			for (int j=2;j<num2 ;j++ ) 
			{
				if (num2%j==0) 
				{
					flage=false;
					break;
				}
			}

			if(flage)
			{
				if (num2<number) 
				{
					prevPrime=num2;
				}
				else if(number<i)
				{
					nextPrime=num2;
					break;
				}
			}
		}
		if (number-prevPrime < nextPrime-number) 
			System.out.print(prevPrime+" "+number);
		else if(number-prevPrime > nextPrime-number)
			System.out.print(number+" "+nextPrime);

		else
			System.out.print(prevPrime+" "+number+" "+nextPrime);	 
		

	}
}