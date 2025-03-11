import java.util.*;
class ReverseStringWithoutChangeIndexOfSpeChar
{
	public static void main(String[] args) 
	{
		// input = ab@cd#e
		// output = ed@cb#a

		String str=new String("ab@cd#e");
		System.out.println(str);
		
		String str1 =str.replaceAll("[^A-Za-z0-9]","");
		str1=new StringBuffer(str1).reverse().toString();
		for (int i=0;i<str.length() ;i++ ) 
		{
			char ch=str.charAt(i);
			if (!((ch>=65&&ch<=90)||(ch>=97&&ch<=122))) {
				str1=str1.substring(0,i)+ch+str1.substring(i);
			}
		}
		System.out.println(str1);

	}
}