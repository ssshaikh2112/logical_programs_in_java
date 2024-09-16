class EmirpNumber
{
	public static void main(String[] args) 
	{
		int number = 11;
		int dupliacte =number;
		boolean flag=true;
		for (int i=2;i<number ;i++ ) 
		{
			if (number%i==0) 
			{
				flag=false;
				break;
			}
		}
		if (flag) 
		{
			int rev =0;
			while (number>0) 
			{
				int rem=number%10;
				rev=rev*10+rem;
				num/=10;
			}
			boolean flag2=true;
			for (int i=2;i<rev ;i++ ) 
			{
				if (rev%i==0) 
				{
					flag2=false;
						break;
				}
				
			}
			if (flag2) 
		{
			System.out.print(dupliacte+" is a EmirpNumber");
		}
		else
			System.out.print(dupliacte+" is not  a EmirpNumber");
		}
		else
			System.out.print(dupliacte+" is not  a EmirpNumber");
	}
}