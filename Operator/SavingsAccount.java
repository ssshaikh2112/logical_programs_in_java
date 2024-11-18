import java.util.Scanner;

public class SavingsAccount 
{
    
/*
  Suppose you save Rs-100 each month into a savings account with the annual interest rate 5%. 
  Thus, the monthly interest rate is 0.05/12 = 0.00417. 
  After the first month 100*(1+0.00417) = 100.417, 
  the value in the account becomes After the second month (100+100.417) * (1 + 0.00417) = 201.252, 
  After the third month,   (100+201.252)*(1+0.00417) = 302.507 and so on. 

  Q. Write a program that prompts the user to enter a monthly saving amount and displays 
  the account value after the sixth month. 
  Here is a sample run: 
  Enter the monthly saving amount: 100 After the sixth month, the account value is Rs - 608.81
*/


  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the monthly saving amount: ");
    double monthlySavings = scanner.nextDouble();

    double monthlyInterestRate = 0.05 / 12;
    double accountValue = monthlySavings;

    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);
    accountValue = (monthlySavings + accountValue) * (1 + monthlyInterestRate);

    System.out.println("After the sixth month, the account value is Rs - "+ accountValue);

  }
}