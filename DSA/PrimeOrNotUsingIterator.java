package collectionprograms;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class PrimeOrNotUsingIterator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}

	//	System.out.println(list);
		boolean flag=true;
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			Integer ele=it.next();
			//System.out.println(ele);
			for(int i=2;i<ele;i++)
			{
				if((ele%i==0))
				{
					flag=false;
					break;
				}
				list.remove(i);
			}
		}
	}

}
