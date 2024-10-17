class AreaAndPerimeterCircle
{
	public static void main(String[] args) 
	{

		/*
			Write a program to display the area and perimeter of a circle that has a radius of 5.5 
		*/

		double radius =5.5;
		double area , perimeter;

		// formullas
		// area = 2*3.14*radius
		// perimeter = 3.14*radius*radius

		area=2*3.14*radius;
		System.out.println("The area of circle is : "+area);

		perimeter = 3.14*radius*radius;
		System.out.println("The perimeter of circle is : "+perimeter);


		/*
			output:
			
			The area of circle is : 34.54
			The perimeter of circle is : 94.985

		*/

	}
}