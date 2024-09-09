class ArmStrongNumber
{

/*

power of digit and then sum of them is number == ArmStrongNumber
		power
1*1 + 5*5*5*5*5  + 3*3*3 == 153

*/

	public static void main(String[] args) 
	{
		int number=153;
		int count=0;
		int duplicateOfNumber=number;
		int sum=0;

		//Loop to find the count of digit
		for (int i=number;i>0 ;i/=10 ) 
			count++;

		// loop terminate when number becomes zero
		while (number>0) 
		{
			int rem=number%10;	// extract last digit
			int pow=1;			// initial power will be 1
			for (int i=1;i<=count ;i++ ) 
			{
				pow*=rem;		// power power will be multiple by itself
			}
			sum+=pow;
			number/=10;	// remove last digit
		}
		System.out.println
		((sum==duplicateOfNumber)?(duplicateOfNumber+ " is ArmStrongNumber"):
			(duplicateOfNumber+" is not ArmStrongNumber"));
	}
}