import java.util.Scanner;

public class DigitSum 
{


/*
Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
Here is a sample run:
Enter a number between 0 and 1000:999
The sum of the digits is 27


*/
  public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = scanner.nextInt();

    if (number < 0 || number > 1000) {
      System.out.println("Invalid input. Please enter a number between 0 and 1000.");
      return;
    }

    int digit1 = number / 100;
    int digit2 = (number % 100) / 10;
    int digit3 = number % 10;

    int sum = digit1 + digit2 + digit3;

    System.out.println("The sum of the digits is " + sum);

  }
}


