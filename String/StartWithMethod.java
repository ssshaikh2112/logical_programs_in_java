class StartWithMethod
{
	// Wrong
	char[] ch=null;
	public boolean startWith(String str)
	{
		for (int i=0;i<str.length() ;i++ ) 
		{
			if (str.charAt(i)!=ch[i]) {
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args) 
	{
		StartWithMethod str1=new StartWithMethod("Hello");
		System.out.println(str1.startWith('H'));
	}
}