class PrimeNumber
{
	public static void main(String[] args) {
		
		int number = 13;
		boolean flag=true;

		for (int i=2;i<number ;i++ ) 
		{
			if (number%i==0) 
			{
				flag=false;
				break;
				
			}

			
		}

		System.out.println((flag)?(number+" : is Prime "):(number+" is Not Prime"));
	}
}