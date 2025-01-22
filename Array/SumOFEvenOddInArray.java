class SumOFEvenOddInArray
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5,6,7,8,9};
		int evenSum=sumOfEvenNumber(arr);
		int oddSum=sumOfOddNumber(arr);
		System.out.println("Sum of Even Number is : "+evenSum);
		System.out.println("Sum of Odd Number is : "+oddSum);
	}

	public static int sumOfEvenNumber(int [] arr)
	{
		int sum =0;

		for (int element :arr ) 
		{
			if (element%2==0) 		// check even num
			{
				sum+=element;		// sum=sum+element
			}
		}

		return sum;

	}

	public static int sumOfOddNumber(int [] arr)
	{
		int sum =0;
		for(int element :arr ) 
		{
			if (!(element%2==0)) 	// check odd num
			{
				sum+=element;		// sum=sum+element
			}
		}
		return sum;
	}
}