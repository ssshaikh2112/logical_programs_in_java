import java.util.Scanner;
class FibonacciiSeries
{
	/* 0 1 1 2 3 5 8 
	   0+1 = 1
	   1+1 = 2
	   2+3 = 5
	   3+5 = 8
	*/   
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number to print your series : ");
		int lastPoint=scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" "+num2+" ");
		for (int i=1;i<=lastPoint ;i++ ) 
		{
			int output=num1+num2;
			System.out.print(output+" ");
			num1=num2;
			num2=output;
		}
	}
}