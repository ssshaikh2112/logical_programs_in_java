class AccentureAssessmentSecondHighOccurance
{
	public static void main(String[] args) 
	{
		int[] array= {5,5,2,2,1,3,1,4,4};
		int largeElement=array[0];
		for (int i=0;i<array.length ;i++ ) 
		{
			if (array[i] > largeElement) 
			{
				if (array[i]>largeElement) {
					largeElement=array[i];

				}
			}
		}
		System.out.println("largeElement : "+largeElement);
	}
}