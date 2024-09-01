class LowerAToZForLoop
{
	public static void main(String[] args) {
		System.out.println("Print the a - z");
		System.out.println("============== First  Logic ==============");

		for (char alpha='a';alpha<='z' ;alpha++ ) 
		{
			System.out.print(alpha+" ");
		}
		
		System.out.println();

		System.out.println("============== Second Logic ==============");
		for (char alpha=97;alpha<=122 ;alpha++ ) 
		{
			System.out.print(alpha+" ");
		}
	}
}