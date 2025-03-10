class Panagram
{
	// IT CONTAINS ALL LETTERS FROM A-Z 
	public static void main(String[] args) 
	{
		String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(str1);
		boolean flag=true;
		for (char i=65;i<=90 ;i++ ) 
		{
			if(!(str1.contains(i+""))) 
			{
				flag=false;
				break;
			}
		}
		System.out.println(flag?str1+" is PANAGRAM ":str1+" is not PANAGRAM");
	}
}