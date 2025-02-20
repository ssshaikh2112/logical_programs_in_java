
package arrays;

public class HighestOccurenceOfStringElementInArray {

	public static void main(String[] args) 
	{
		String[] arr= {"PEN","BOTTOL","MARKER","PEN","BOTTLE","DUSTER"};
		boolean[] b=new boolean[arr.length];
		int max=0;
		String ele="";
		for (int i = 0; i < arr.length; i++) {
			int cnt=0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j] && b[j]==false) 
				{
					cnt++;
					b[j]=true;
				}
			}
			if (cnt!=0) 
			{
				if (max<cnt) 
				{
					max=cnt;
					ele=arr[i];
				}
			}
		}
		System.out.println("Highest Element is : "+ele+" with "+max+" count");
	}

}
