import java.util.Scanner;

public class RunwayLength 
{
	/*
		Given an airplane's acceleration a and take-off speed v, 
		you can compute the minimum runway length needed for an airplane to take off using 
		the following formula: length = v2 /2a 
		Q. Write a program that prompts the user to enter v in meters/second (m/s) and 
		the acceleration a in meters/second squared (m/s2) and displays the minimum runway length. 
		Here is a sample run: Enter speed and acceleration: 60 3.5 The minimum runway length for 
		this airplane is 514.286
	*/

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter speed : ");
    double speed = scanner.nextDouble();
    System.out.print("Enter acceleration : ");
    double acceleration = scanner.nextDouble();

    double length = Math.pow(speed, 2) / (2 * acceleration);

    System.out.println("The minimum runway length for this airplane is : "+ length);

  }
}