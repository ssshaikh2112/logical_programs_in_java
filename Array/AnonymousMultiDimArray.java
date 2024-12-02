class AnonymousMultiDimArray
{
	public static void main(String[] args) 
	{
		
		// int [][][] a=new int[2][][];
		// int [][][] a={{{10,20,30}},{{40},{50,60}}}

		int[][][] arr =new int[][][]{{{10,20,30}},{{40},{50,60}}};
		checkEvenOdd(arr);
	}
	public static void checkEvenOdd(int [][][] arr)
	{
		for (int[][] i:arr ) 
		{
			if(i%2 == 0) {
				System.out.println(i+" Even");
			}
			else
				System.out.println(i+" Odd");
		}
	}
}