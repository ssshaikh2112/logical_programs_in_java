import java.util.Scanner;

class ScannerExp3OwelOrConsonent
{
	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Name: ");

		char name=scan.next().toLowerCase().charAt(0);		// To convert the UpperCase First letter in lower case
															// If not then it shown and Consenent because Java is Case Sensitive

		System.out.println(((name=='a' || name=='e' ||name=='i' ||name=='o' ||name=='u') ? 
				(name+" It is Owel."):(name +" It is Consenont")));
		
	}
}