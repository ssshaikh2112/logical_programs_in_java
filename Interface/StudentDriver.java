// Example of toString String
//How to print the data by using toString() , it override method from Object class.
//toString() is responsible for print the object reference

class Student
{
	int id;
	
	String name;
	String edu;
	int yop;
	Student(int id , String name , String edu ,int yop)
	{


		
		this.id=id;
		this.name=name;
		this.edu=edu;
		this.yop=yop;
	}
	@Override
	public String toString()
	{
		return "ID : "+id+" , Name : "+name+" , Edu : "+edu+" , YOP : "+yop;
	}
}

class StudentDriver
{
	public static void main(String[] args) 
	{
		Student stud1=new Student(101 , "Jonas" , "B.TECH", 2019);
		Student stud2=new Student(102 , "Martha" , "M.TECH", 2020);
		Student stud3=new Student(103 , "Mikkel" , "BCA", 1989);
		Student stud4=new Student(104 , "Noava" , "MCA", 1953);
		System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);
		System.out.println(stud4);

	}

}















































