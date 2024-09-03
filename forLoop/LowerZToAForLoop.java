class LowerZToAForLoop
{
	public static void main(String[] args) {
		
		System.out.println("Print the z - a");
		System.out.println("============== First  Logic ==============");

		for (char alpha='z';alpha>='a' ;alpha-- ) 
		{
			System.out.print(alpha+" ");
		}
		
		System.out.println();

		System.out.println("============== Second Logic ==============");
		for (char alpha=122;alpha>=97 ;alpha-- ) 
		{
			System.out.print(alpha+" ");
		}
	}
}