import java.util.Scanner;

class SwapNumWithoutTemp1
{

// If calculation is greater then not possible to swap
	//But possible when use the large data type , with int it can not be possible....
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);


	System.out.print("Enter First Number : ");
	long num1=scan.nextLong();
	System.out.print("Enter Second Number : ");
	long num2=scan.nextLong();

	System.out.println("Before Swapping : ");
	System.out.println("num1 : "+num1);
	System.out.println("num2 : "+num2);	

	num1=num1*num2;		
	num2=num1/num2;		
	num1=(num1+num2)/num2-1;	

	System.out.println();

	System.out.println("After Swapping : ");
	System.out.println("num1 : "+num1);
	System.out.println("num2 : "+num2);


}
}