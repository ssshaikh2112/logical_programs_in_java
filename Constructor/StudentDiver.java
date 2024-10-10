class Student
{
	int sid;
	String sname;
	String graduation;
	
	Student(int sid , String sname , String graduation)
	{
		super();
		this.sid=sid;
		this.sname=sname;
		this.graduation=graduation;

	}
	void display()
	{
		System.out.println("Id : "+sname);
		System.out.println("Name : "+sname);
		System.out.println("Graduation : "+graduation);
	}
}

class StudentDiver
{
	public static void main(String[] args) 
	{
		System.out.println("Details od Students : ");
		System.out.println();
		Student stud1 =new Student(101 , "Jonas" , "Quantom Theory");
		stud1.display();
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		Student stud2 =new Student(102 , "Martha" , "String Theory");
		stud2.display();


	}
}
