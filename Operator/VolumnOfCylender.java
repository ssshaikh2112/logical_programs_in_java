import java.util.Scanner;

class VolumnOfCylender
{

	/*
		Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
		area 3.14* radius radius volume area* height
		Here is a sample run:
		Enter the radius and height of a cylinder: 5.5 12 The area is 95.0331
		The volume is 1140.4
	*/

	public static void main(String[] args) 
	{
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the radius of a cylinder: ");
    	double radius = scanner.nextDouble();

    	System.out.print("Enter the height of a cylinder: ");
    	double height = scanner.nextDouble();

    	double area = 3.14 * radius * radius;
    	double volume = area * height;

    	System.out.println("The area is "+ area);
    	System.out.println("The volume is "+ volume);	



    	/*
    	op:
			Enter the radius of a cylinder: 5.5
			Enter the height of a cylinder: 12
			The area is 94.985
			The volume is 1139.82
    	*/	
	}	
}