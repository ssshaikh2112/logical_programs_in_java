import java.util.Scanner;
class DuckNumber
{

/*
0 is in number present is DuckNumber
not present at start

*/	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String number = scan.next();
		boolean flag = false;

		if (!(number.charAt(0)=='0')) 
		{
			for (int i=1;i<number.length();i++) 
			{
				if (number.charAt(i)=='0') 
				{
					flag=true;
					break;
				}
			}
			if (flag) 
				System.out.print(number+" is a DuckNumber");
			else
				System.out.print(number+" is not a DuckNumber");
		}
		else
			System.out.print(number+" is not a DuckNumber");
	}
}