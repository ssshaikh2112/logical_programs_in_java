import java.util.Scanner;

public class MonthlyInterest 
{
    /*
        If you know the balance and the annual percentage interest rate, 
        you can compute the interest on the next monthly payment using the following 
        formula: interest =balance (annualinterestRate/1200) 
        Q. Write a program that reads the balance and the annual percentage interest rate and 
        displays the interest for the next month. 
        Here is a sample run: Enter balance - 1000 and 
        interest rate (e.g. 3 for 3%) -3.5 The interest is 2.91667
    */

  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter balance: ");
    double balance = scanner.nextDouble();

    System.out.print("Enter interest rate (e.g. 3 for 3%): ");
    double annualInterestRate = scanner.nextDouble();

    // Calculate the interest for the next month
    double interest = balance * (annualInterestRate / 1200);

    System.out.printf("The interest is : "+ interest);

  }
}

/*
Enter balance: 1000
Enter interest rate (e.g. 3 for 3%): 3.5
The interest is : 2.916666666666667
*/