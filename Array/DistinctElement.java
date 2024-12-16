
import java.util.*;
class DistinctElement
{
	public static void main(String[] args) 
	{
		int[] array={5,3,2,1,3,4,2,2,4,7};
		int len =array.length;
		boolean[] booleanArray=new boolean[len];			/* to keep track of array , 
															use for check is element is checked then 
															it become true and not check letter after once 
															checked*/
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(booleanArray));

		for (int i=0;i<len ;i++ ) 
		{
			int ielement =array[i];
			int iCount=0;
			for (int j=0;j<len ;j++ ) 
			{
				int jelement =array[j];
				if (ielement==jelement && booleanArray[j]==false) 
				{
					iCount++;
					booleanArray[j]=true;
				}
			}
			if (iCount==1) 
			{
				System.out.println(ielement+" : "+iCount);
			}
		}
	}
}