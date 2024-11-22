import java.util.*;
class AccentureAssessment
{
	public static void main(String[] args) 
	{
		int[] sem1 ={40,60,35,48,69,80};
		int[] sem2 ={20,80,70,68,48,70};
		int[] result=new int[sem1.length];
		int count=3;

		for (int i=0;i<sem1.length ;i++ ) 
		{
			result[i]=sem2[i]-sem1[i];
		}

		System.out.println(Arrays.toString(sem1));
		System.out.println(Arrays.toString(sem2));	
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

		int totalMarks=0;
		for (int i=result.length-1;i>=0 ;i-- ) 
		{
			if (result[i]>0 && count!=0) 
			{
				totalMarks+=result[i];
				count--;
			}
		}
		if (totalMarks>=35) 
		{
			System.out.println("PASS "+totalMarks);
		}
		else
			System.out.println("FAIL "+totalMarks);

	}
}