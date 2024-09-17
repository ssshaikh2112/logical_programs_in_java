class FascinatingNumber
{

/*

number = 327;
327 + 327*2 + 327*3 == 327654981327
check 1-9 digit are present exactly once 
not repeat
not missing
no 0 (Zero)
ex Fascinating Number : 
	123456789
	213456789
	342156789
	987654321
	678594321


ex not Fascinating Number:
	112345678
	122345678
	90854321
	098765432
*/	
	public static void main(String[] args) 
	{
		int number=327;
		String op=""+number+(number*2)+(number*3);
		System.out.print(op);
		boolean flag =true;

		for (char i='1';i<='9' ;i++ ) 
		{
			int count =0;
			for (int j=0;j<op.length() ;j++ ) 
			{
				char ch=op.charAt(j);
				if(i==ch)
				{
					count++;
				}
			}
			if (!(count==1)) 
			{
				flag=false;
				break;
			}
		}
		if (flag) 
		{
			System.out.print(number+" is a Fascinating Number");
		}
		else{
			System.out.print(number+" is not a Fascinating Number");
		}
	}
}