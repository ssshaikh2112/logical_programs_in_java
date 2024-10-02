import java.util.Scanner;
class SumOfPrimeDigit
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int number=scan.nextInt();
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			int num=rem;

			boolean flag =true;
			if(num<2)
				flag=false;

			for (int i=2;i<num ;i++ ) 
			{
				if (num%i==0) 
				{
					flag=false;
					break;
				}
			}
			if (flag) 
			{
				sum+=rem;
			}
			number/=10;

		}
		System.out.println(sum);
	}
}