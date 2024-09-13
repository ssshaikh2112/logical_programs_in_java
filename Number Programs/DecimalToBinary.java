class DecimalToBinary
{
	public static void main(String[] args) 
	{
		int number=112;
		int duplicate=number;
		String binary="";
		int fact=0;
		for (int i=number;i>0 ;i/=2 ) 
		{
			fact=i%2;	
			System.out.print(fact);
			binary=fact+binary;
		}	
		System.out.println();
		System.out.print("Binary of "+duplicate+" is : "+binary);
	}
}