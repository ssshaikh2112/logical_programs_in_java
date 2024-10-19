import java.util.Scanner;

public class AverageAcceleration 
{
/*
Average acceleration is defined as the change of velocity divided by the time taken to make the change, 
as shown in the following formula: a = v1-vo/t 
Q. Write a program that prompts the user to enter the starting velocity vo in meters/ second, 
the ending velocity v1 in meters/second, and the time span t in seconds, 
and displays the average acceleration. Here is a sample run: Enter v0, v1, and t: 5.5 50.9 4.5 
The average acceleration is 10.0889
*/

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter v0 : ");
    double v0 = scanner.nextDouble();
    System.out.println("Enter v1 : ");
    double v1 = scanner.nextDouble();
    System.out.println("Enter t : ");
    double t = scanner.nextDouble();

    double acceleration = (v1 - v0) / t;

    System.out.println("The average acceleration is "+ acceleration);

  }
}