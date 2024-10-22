import java.util.Scanner;

public class BMI 
{

  /*
Q. Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note that one pound is 0.45359237 kilograms, and one inch is 0.0254 meters.
Body Mass Index
Here is a sample run:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
18.5

  */
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weightInPounds = scanner.nextDouble();

    System.out.print("Enter height in inches: ");
    double heightInInches = scanner.nextDouble();

    // Convert weight from pounds to kilograms
    double weightInKilograms = weightInPounds * 0.45359237;

    // Convert height from inches to meters
    double heightInMeters = heightInInches * 0.0254;

    // Calculate BMI
    double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

    System.out.printf("BMI is %.4f%n", bmi);

    if (bmi < 18.5) 
    {
      System.out.println("Underweight");
    } else if (bmi < 25) 
    {
      System.out.println("Normal weight");
    } else if (bmi < 30) 
    {
      System.out.println("Overweight");
    } else 
    {
      System.out.println("Obese");
    }

  }
}

/*
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
Overweight
*/