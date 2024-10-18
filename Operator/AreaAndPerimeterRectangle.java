class AreaAndPerimeterRectangle
{
	/*
		Write a program to display the area and perimeter of a recatangle that has 
		a width of 4.5 and height 7.9
	*/
	public static void main(String[] args) 
	{
		double height=7.9;
		double width=4.5;

		double area , perimeter;

		// area = height*width
		// perimeter = 2(height+width)

		area=height*width;
		System.out.println("The area of Rectangle is : "+area);

		perimeter=2*(height+width);
		System.out.println("The Perimeter of Rectangle is : "+perimeter);

		/*
			The area of Rectangle is : 35.550000000000004
			The Perimeter of Rectangle is : 24.8
		*/
	}
}