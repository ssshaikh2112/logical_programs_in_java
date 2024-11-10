import java.util.Scanner;

public class HexagonArea 
{
	/*
		Write a program that prompts the user to enter the side of a hexagon and displays its area. 
		The formula for computing the area of a hexagon is Area = 3*(√2/2)s^2 
		where s is the length of a side.
		Here is a sample run: Enter the side: 5.5 The area of the hexagon is 78.5895
	*/
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the side: ");
    double side = scanner.nextDouble();

    // Calculate the area of the hexagon
    double area = (3 * (Math.sqrt(2) / 2) )* side * side;

    System.out.println("The area of the hexagon is : "+area);

  }
}

/*
Enter the side: 5.5
The area of the hexagon is : 64.1699403926792
*/