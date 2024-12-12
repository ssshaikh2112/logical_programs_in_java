import java.util.*;
class Student
{
	int id;
	String sname;
	String branch;
	int yop;
	double cgpa;

	Student(int id , String sname , String branch , int yop , double cgpa)
	{
		this.id=id;
		this.sname=sname;
		this.branch=branch;
		this.yop=yop;
		this.cgpa=cgpa;
	}
	@Override
	public String toString()
	{
		return "Id : "+id+" , Name : "+sname+"Branch : "+branch+"YOP : "+yop+"CGPA : "+cgpa;
	}
}

class BubbleSortObjectId
{
	public static void main(String[] args) 
	{
		Student[] student=new Student[5];
		student[0]=new Student(110, " JONAS", "CS" , 2019 , 9.5);
		student[3]=new Student(103, " MARTHA", "MECH" , 2020 , 9.5);
		student[2]=new Student(102, " MIKKEL", "CIVIL" , 1989 , 8.5);
		student[1]=new Student(101, " URICH", "IT" , 1956 , 6.5);
		student[4]=new Student(104, " NOA", "CS" , 1921 , 7.15);

		bubbleSort(student);
		for (Student stud : student) 
		{
			System.out.println(stud);
		}
	}

	public static void bubbleSort(Student[] array)
	{
		for (int i=0;i<array.length ;i++ ) 
		{
			for (int j=i+1;j<array.length ;j++ ) 
			{
				if ((array[i].id)<(array[j].id)) 
				{
					Student temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}

}	