class EvenOddNumber
{
	public static void main(String[] args) 
	{
		int [] array={1,2,3,4,5,6,7,8,9};

		for (int i=0;i<array.length ;i++ ) 
		{
			if (array[i]%2==0)
				System.out.println("Even : "+array[i]);
			else
				System.out.println("Odd : "+array[i]);
		}
	}
}