import java.util.Scanner;

class ScannerExp2String
{
	public static void main(String[] args) 
	{


		Scanner scan= new Scanner(System.in);
			
		System.out.print("Enter Your String : ");
		String str1=scan.nextLine();					// Accept whole line with spaces
		System.out.println(str1);	


		/*
				if we write next() before the the nextLine()
				then we need to add nextLine() in between them

		*/

		System.out.print("Enter Your String : ");
		String str2=scan.next();					// print only first String after space it neglate the remaining	
		System.out.println(str2);		
	}
}