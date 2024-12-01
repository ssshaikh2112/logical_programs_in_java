import java.util.*;
class AdditionOfNumUsingVarargs
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
		addition(10,20,30,40,50);
	}

	public static void addition(int ... num)
	{
		int sum=0;
		for (int number : num) 
		{
			sum+=number;
		}
		System.out.println(sum);
	}
}