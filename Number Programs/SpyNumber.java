class SpyNumber
{
	// sum of all digit == product of all digit
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		int prod=1;

		for (int i=num;i>0 ;i/=10 ) 
		{
			int rem=i%10;
			sum+=rem;		//2
			prod*=rem;
		}	
		System.out.println("Sum of all digit is : "+sum);

		System.out.println("Product of all digit is : "+prod);

		System.out.println((sum==prod)?(num + " is a spy Number"):(num+" is not spy Number"));
	}
}