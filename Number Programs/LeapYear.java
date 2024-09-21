import java.util.Scanner;

class LeapYear
{
	/*
		year % 4==0
		year%100 == 0
		year % 400 ==0

A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.
	*/
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year=scan.nextInt();

		if (year%4==0) 
		{
			System.out.println(year+ " is a leap year!!!!!!!");
			if (year%100==0) 
			{
				System.out.println(year+ " is a leap year!!!!!!!");
				if (year%400==0) 
				{
					System.out.println(year+ " is a leap year!!!!!!!");
				}
			}

		}
		else
			System.out.print(year+" Not a leap year!!!!!!!!!");
	}
}