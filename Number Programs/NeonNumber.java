import java.util.Scanner;

class NeonNumber
{
/*
Square of number and then addition of digit of it == original number
*/	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number =scan.nextInt();
		int sqr=number*number;
		int duplicate=number;
		int sum=0;
		int rem=0;
		while(sqr>0)
		{
			rem=sqr%10;
			sum+=rem;		// sum+=sqr%10;
			sqr/=10;
		}
		/*
		for (;sqr>0 ;sqr/10 ) {
			sum+=sqr%10;
			
		}
		*/
		System.out.print((duplicate==sum)?((duplicate+" is a NeonNumber")):((duplicate+" is not  a NeonNumber")));
	}
}