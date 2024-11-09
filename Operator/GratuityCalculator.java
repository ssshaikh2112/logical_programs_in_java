import java.util.Scanner;

public class GratuityCalculator 
{
	/*

	Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
	For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 
	as gratuity and $11.5 as total. Here is a sample run:
	Enter the subtotal 10 and a tip rate 15
	The tip is 1.5 and total is 11.5
	*/

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the subtotal: ");
    double subtotal = scanner.nextDouble();

    System.out.print("Enter a tip rate (e.g. 15 for 15%): ");
    double tipRate = scanner.nextDouble();

    double tip = subtotal * (tipRate / 100);
    double total = subtotal + tip;

    System.out.println("The tip is "+tip+" and total is "+total);

  }
}

