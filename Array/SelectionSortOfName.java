import java.util.*;
class SelectionSortOfName
{
	public static void main(String[] args) 
	{
		String[] names={"JONAS","MARTHA","MIKKEL","NOA","URICH","HENNA"};
		System.out.println(Arrays.toString(names));

		sortNameDesc(names);
		sortNameAsc(names);
	}
	public static void sortNameDesc(String[] names)
	{
		for (int i=0;i<names.length ;i++ )
		{
			int index=i;
			for (int j=i+1;j<names.length ;j++ ) 
			{
				if ((names[i].compareTo(names[j]))<0) 
				{
					index=j;
				}
			}
			String temp=names[i];
			names[i]=names[index];
			names[index]=temp;
		}
		System.out.println(Arrays.toString(names));
	}

	public static void sortNameAsc(String[] names)
	{
		for (int i=0;i<names.length ;i++ )
		{
			int index=i;
			for (int j=i+1;j<names.length ;j++ ) 
			{
				if ((names[i].compareTo(names[j]))>0) 
				{
					index=j;
				}
			}
			String temp=names[i];
			names[i]=names[index];
			names[index]=temp;
		}
		System.out.println(Arrays.toString(names));
	}
}