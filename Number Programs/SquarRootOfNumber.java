class SquarRootOfNumber
{
	public static void main(String[] args) 
	{
		int number=49;

		int sqrt=0;
		for (int i=1;i<number/3 ;i++ ) 
		{
			if(i%i==number)
			{
				sqrt=i;
				break;
			}
				
		}
		if (sqrt!=0)
			System.out.print("Sqrt of "+number+" "+sqrt+" ");
		else
			System.out.print(number+" does not have perfect square");
	

	}
}