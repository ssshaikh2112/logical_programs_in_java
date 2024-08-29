class AsciiCharWithAcsiiValue
{
	public static void main(String[] args) 
	{
		System.out.println("Upper Case : ");
		System.out.println("Print the A - Z");
		System.out.println("============== First  Logic ==============");

		for (char alpha='A';alpha<='Z' ;alpha++ ) 
		{
			System.out.print(alpha+" : "+(int)alpha+" ");
		}
		
		System.out.println();

		System.out.println("============== Second Logic ==============");
		for (char alpha=65;alpha<=90 ;alpha++ ) 
		{
			System.out.print(alpha+" : "+(int)alpha+" ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Lower Case : ");
		System.out.println("Print the a - z");
		System.out.println("============== First  Logic ==============");

		for (char alpha='a';alpha<='z' ;alpha++ ) 
		{
			System.out.print(alpha+" : "+(int)alpha+" ");
		}
		
		System.out.println();

		System.out.println("============== Second Logic ==============");
		for (char alpha=97;alpha<=122 ;alpha++ ) 
		{
			System.out.print(alpha+" : "+(int)alpha+" ");
		}
	}
}