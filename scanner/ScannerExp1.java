import java.util.Scanner;

class ScannerExp1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter byte data : ");
		byte a =scan.nextByte();
		System.out.println(a);

		System.out.println("Enter short data : ");
		short b= scan.nextShort();
		System.out.println(b);


		System.out.println("Enter Int data : ");
		int c=scan.nextInt();
		System.out.println(c);


		System.out.println("Enter float data : ");
		float d=scan.nextFloat();
		System.out.println(d);

		System.out.println("Enter Long data : ");
		long e=scan.nextLong();
		System.out.println(e);

		System.out.println("Enter Double data : ");
		Double f=scan.nextDouble();		
		System.out.println(f);

		System.out.println("Enter Boolean data : ");
		boolean g=scan.nextBoolean();		
		System.out.println(g);



		
	}
}