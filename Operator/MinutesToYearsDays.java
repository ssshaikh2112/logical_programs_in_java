import java.util.Scanner;

public class MinutesToYearsDays 
{
    /*
        Write a program that prompts the user to enter the minutes (e.g., 1 billion),
        and displays the number of years and days for the minutes. For simplicity, 
        assume a year has 365 days.
        Here is a sample run: Enter the number of minutes: 1000000000 
        1000000000 minutes is approximately 1902 years and 214 days


    */

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of minutes: ");
    long minutes = scanner.nextLong();

    long totalDays = minutes / 60 / 24; // convert minutes to days
    long years = totalDays / 365; // calculate years
    long days = totalDays % 365; // calculate remaining days

    System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

  }
}