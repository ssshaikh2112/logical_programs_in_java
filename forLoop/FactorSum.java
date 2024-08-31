import java.util.Scanner;
class FactorSum
{
	//WAJP to find the sum of factors of number
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number =scan.nextInt();
		int sum=0;
		System.out.print("Factors are : ");
		for (int i=1;i<=number ;i++ ) 
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
				
		}
		System.out.println();
		System.out.print("Sum of all factors is : "+sum);

	}	
}