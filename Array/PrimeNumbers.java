class PrimeNumbers
{
	public static void main(String[] args) 
	{
		int [] array={1,2,3,4,5,6,7,8,9};
		
		for (int i=0;i<array.length ;i++ ) 
		{
			for (int j=2;j<array[i] ;j++ ) 
			{
				if (!(array[i]%2==0)) 
				{
					System.out.println(array[i]);
					break;
				}
			}
			
		}
	}
}