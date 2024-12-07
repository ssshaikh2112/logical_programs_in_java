class AverageOfElements
{
	public static void main(String[] args) 
	{
		int [] array={1,2,3,4,5,6,7,8,9};

		int sum=0;
		int count=0;
		for (int i=0;i<array.length ;i++ ) 
		{
			sum+=array[i];
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println(sum/count);
	}
}