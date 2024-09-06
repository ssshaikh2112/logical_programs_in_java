import java.util.Scanner;

class Calculator
{
	public static void main(String[] args) 
	{
		System.out.println("******************************************************");
		System.out.println();
		System.out.println("******* Calculator *******");
		System.out.println();

		Scanner scan= new Scanner(System.in);
		
		double output=0;


		outerloop:
		for (; ; ) 
		{

			System.out.print("Enter Operand 1 : ");
			double operand1=scan.nextDouble();
			System.out.print("Enter Operator : ");
			char operator =scan.next().charAt(0);
			System.out.print("Enter Operand 2 : ");
			double operand2=scan.nextDouble();

			switch(operator)
			{
				case '+':
					output=operand1+operand2;
					break;
				case '-':
					output=operand1-operand2;
					break;
				case '*':
					output=operand1*operand2;
					break;
				case '/':
					output=operand1/operand2;
					break;
				case '%':
					output=operand1%operand2;
					break;
				case '#':
				break outerloop;	// System.exit(0);
				default:
					System.out.println("Wrong Oprator...");
			}
			System.out.println("output is : "+output);

		}
		System.out.print("******************************************************");

	}
}