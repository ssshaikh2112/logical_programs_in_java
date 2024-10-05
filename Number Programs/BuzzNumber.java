class BuzzNumber
{
	/*
number is divisible by 7 or number has last digit 7 == BuzzNumber

	*/
	public static void main(String[] args) 
	{
		int number=49;
		int duplicate=number;
		int buzz=0;

			if((number%7==0)|| (number%10==7)){
				//buzz=number;
				System.out.print("BuzzNumber");
			}	
	}
}