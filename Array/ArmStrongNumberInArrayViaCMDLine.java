import java.util.*;
class ArmStrongNumberInArrayViaCMDLine
{
	public static void main(String[] args) 
	{
		int [] numbers=new int[2];
		for (int i=0;i<args.length ;i++ ) 
		{
			numbers[i]=Integer.parseInt(args[i]);
		}
		for (int ele :numbers ) 
		{
			isArmstrong(ele);
		} 
	}
	public static void isArmstrong(int num)
	{
		int pow =(num+"").length();
		int sum=0;
		for (int i=num;i!=0 ;i/=10 ) 
		{
			sum+=Math.pow((i%10), pow);
		}
		if (sum==num) 
		{
			System.out.println(num);
		}
	}
}