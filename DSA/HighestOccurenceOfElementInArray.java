package arrays;

public class HighestOccurenceOfElementInArray {

	public static void main(String[] args) 
	{
		int[] arr= {1,5,4,6,2,5,5,1,5,2,6,1,8,1,7};
		boolean[] b=new boolean[arr.length];
		int max=0;
		int ele=0;
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
