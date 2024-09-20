class KrishnaMurthiNumber
{
	/*

1 4 5 = 
{			factorial
	1*1 + 4*3*2*1 + 5*4*3*2*1 == 145

	145==145	KrishnaMurthiNumber
	sum != 145  not KrishnaMurthiNumber
}

	*/
	public static void main(String[] args) 
	{
		int number=145;
		int duplicate = number;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			int fact=1;
			for (int i=1;i<=rem ;i++ ) 
			{
				fact*=i;
			}
			sum+=fact;
			number/=10;
		}
		System.out.println((sum==duplicate)?(duplicate+" is a KrishnaMurthiNumber "):(duplicate+" is not KrishnaMurthiNumber"));
	}
}