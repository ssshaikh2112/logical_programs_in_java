class RandomAlphabet
{
	public static void main(String[] args) 
	{
		// Pattern : 	A D G J M P S V Y
		System.out.println("Access Random alphabet and make given Pattern : ");
		
		for (char alph=65;alph<=90 ;alph+=3 ) 
		{
			System.out.print(alph+" ");
			
		}

		System.out.println();
		for (char alph='A';alph<='Z' ;alph+=3 ) 
		{
			System.out.print(alph+" ");
			
		}
	}
}