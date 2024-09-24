class PerfectNumber
{
	//   addition of numbers of factors of number  (except < number) == number
	public static void main(String[] args) 
	{
		int num =496;
		int dup=num;
		int sum=0;
		System.out.println("addition of numbers of factors of number");
		System.out.println("Original number is : "+num);
		System.out.print("Factorials are : ");
		for (int i=1;i<num ;i++ ) 
		{
			if(num%i==0)
			{
				System.out.print(i+" ");	
				sum+=i;
			}	
		}	
		System.out.println("");
		System.out.println("Sum of factorials is : "+sum);
		System.out.println((dup==num)?(dup+" is a PerfectNumber"):(dup+" is not a PerfectNumber"));
	}
}