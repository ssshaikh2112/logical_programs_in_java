import java.util.Scanner;

public class TripCost 
{
    /*
        Write a program that prompts the user to enter the distance to drive, 
        the fuel efficiency of the car in miles per gallon, and the price per gallon, 
        and displays the cost of the trip. Here is a sample run: Enter the driving distance: 900.5 
        Enter miles per gallon: 25.5 Enter price per gallon: 3.55 The cost of driving is $125.36
    */
  public static void main(String[] args)
   {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the driving distance: ");
    double distance = scanner.nextDouble();

    System.out.print("Enter miles per gallon: ");
    double milesPerGallon = scanner.nextDouble();

    System.out.print("Enter price per gallon: ");
    double pricePerGallon = scanner.nextDouble();

    // Calculate the cost of the trip
    double gallonsUsed = distance / milesPerGallon;
    double cost = gallonsUsed * pricePerGallon;

    System.out.println("The cost of driving is : "+ cost);

  }
}

/*
Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is : 125.36372549019607

*/