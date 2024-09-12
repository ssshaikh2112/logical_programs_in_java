import java.util.Scanner;
class CountOfDigitInNumber
{
/*
Find how many digits are present in the number
number = 4563142
	4   5   6   3   1  4    2 == 7 numbers are present
   (1	2	3	4	5  6	7)
*/

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number=scan.nextInt();
		int count=0;
		for (int i=number;i>0;i/=10 ) 
				count++;
		System.out.println(count+" digits are present in "+ number);


/*
		while(number>0)
		{
			count++;
			number/=10;
		}
		System.out.println(count);
*/
	}
}