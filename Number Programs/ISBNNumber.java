class ISBNNumber
{

/*
1	2	5	9	0	6	0	9	7	7
*	*	*	*	*	*	*	*	*	* 
10	9	8	7	6	5	4	3	2	1
||	||	||	||	||	||	||	||	||	||
10 + 18	40	
addition of all 209 %11==0 
*/	
	public static void main(String[] args) 
	{
		int number=1259060977;
		int dup=number;
		int num1=1;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum+=(rem*num1++);
			number/=10;
		}
		//System.out.print(sum);
		System.out.print((sum%11==0)?(dup+" is a ISBNNumber"):(dup+" is not ISBNNumber"));
	}
}