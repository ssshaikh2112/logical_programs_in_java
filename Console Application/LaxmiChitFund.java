import java.util.*;
class LaxmiChitFund 
{
  static Scanner sc = new Scanner(System.in);
  static String user;
  static long phone;
  static String add;
  static String type;
  static int pin;
  static double bal;
  static ArrayList<String> tran = new ArrayList<>();
  public static void main(String[] args) 
  {
    for(;;)
    {
      System.out.println();
      System.out.println("** WELCOME **");
      System.out.println("   LAXMI CHIT FUND   ");
      System.out.println();
      System.out.println("1. NEW ACCOUNT");
      System.out.println("2. LOGIN");
      System.out.println();
      System.out.print("ENTER AN OPTION : ");
      int option = sc.nextInt();
      switch(option)
      {
        case 1 : newAccount();break;
        case 2: loginUser();break;
        default : System.out.println("WRONG OPTION ENTERED");
      }
    }
  }
  public static void newAccount()
  {
   if (user!=null) 
   {
    System.out.println();
    System.out.println("ACCOUNT IS ALREADY CREATED");
    return;
  } 
  System.out.println();
  System.out.println("ACCOUNT CREATION");
  System.out.print("USERNAME  : ");
  sc.nextLine();
  user =sc.nextLine();
  System.out.print("PHONE NUMBER : ");
  phone = sc.nextLong();
  System.out.print("ADDRESS : ");
  sc.nextLine();
  add = sc.nextLine();
  System.out.print("PIN : ");
  pin= sc.nextInt();
  System.out.print("ACCOUNT TYPE : ");
  type = sc.next();
  System.out.print("AMOUNT TO BE DEPOSITED : ");
  bal = sc.nextDouble();
  tran.add("CREATED : "+bal);
  System.out.println();
  System.out.println("ACCOUNT CREATED");
}
public static void loginUser() 
{
  if (user!=null) 
  {
    System.out.println();    
    System.out.println("LOGIN");   
    System.out.println("USERNAME : ");  
    sc.nextLine();
    String user1 = sc.nextLine();  
    System.out.println("PIN : ");    
    int pin1 =sc.nextInt();
    if(user1.equals(user)&&pin==pin1)
    {
      features();
    }
    else
    {
     System.out.println();     
     System.out.println("WRONG CREDENIALS ENTRED");   
     System.out.println(); 
   }
 }
 else
 {
  System.out.println("ACCOUNT NOT EXISTS. CREATE ACCOUNT FIRST");
}
}
public static void features() 
{
  System.out.println();
  System.out.println("FEATURES");
  System.out.println("1.DEPOSIT AMOUNT");
  System.out.println("2.DEBIT AMOUNT");
  System.out.println("3.CHECK BALANCE");
  System.out.println("4.TRANSFER AMOUNT");
  System.out.println("5.STATEMENT");
  System.out.println("6.EDIT ACCOUNT");
  System.out.println("7.LOGIN AND MORE");
  System.out.println("8.EXIT");
  System.out.println();
  System.out.print(" ENTER AN OPTION : ");
  int option = sc.nextInt();
  switch (option) {
    case 1: depositAmount();break;
    case 2: debitAmount();break;
    case 3: checkBalance();break;
    case 4: transferAmount();break;
    case 5: statement();break;
    case 6: editAccount();break;
    case 7: loan();break;
    case 8: System.exit(0);
    case 9 : editAccount();break;
    default:System.out.println(" WRONG OPTION ENTER");
  }
  System.out.println();
}
public static void statement() 
{
  System.out.println();
  System.out.println("STATEMENT");
  System.out.println();
  for(String i : tran)
  {
    System.out.println(i);
  }
  System.out.println();
}
public static void checkBalance() 
{
  System.out.println("CHECK BALANCE");
  System.out.println();
  System.out.println("ENTER YOUR PIN");
  int pin1=sc.nextInt();
  if (pin==pin1) 
  {
    System.out.println();
    System.out.println("YOUR ACCOUNT BALANCE IS : "+bal+"cr");
  }
  else
  {
    System.out.println();
    System.out.println("WRONG PIN ENTERED");
  }
}
public static void depositAmount() 
{
  System.out.println();
  System.out.println("DEPOSIT AMOUNT");
  System.out.println();
  System.out.println("ENTER AN AMOUNT");
  double deposit = sc.nextDouble();
  bal =bal+deposit;
  tran.add("CREADITED : "+deposit);
  System.out.println();
  System.out.println("AMOUNT DEPOSITED");
}
public static void debitAmount() 
{
  System.out.println();
  System.out.println("DEBIT AMOUNT");
  System.out.println();
  System.out.println("ENTER AN AMOUNT");
  double debit =sc.nextDouble();
  System.out.println("ENTER YOUR PIN");
  int pin1=sc.nextInt();
  if (pin1==pin) 
  {
    if (debit<=bal) 
    {
     bal=bal-debit;
     tran.add("DEBITED"+debit);
     System.out.println("AMOUNT DEBITED");   
   }    
   else
   {
     System.out.println();
     System.out.println("INSUFFIECENT FUND");
   }
 }
 else
 {
  System.out.println();
  System.out.println("WRONG PIN ENTERED");
}

}
public static void editAccount() 
{
  System.out.println("EDIT ACCOUNT");
  System.out.print("ENTER YOUR PIN: ");
  int pin1 = sc.nextInt();
  if (pin1 == pin) 
  {
    System.out.println("CURRENT DETAILS:");
    System.out.println("USERNAME: " + user);
    System.out.println("PHONE NUMBER: " + phone);
    System.out.println("ADDRESS: " + add);
    System.out.println("ACCOUNT TYPE: " + type);
    System.out.println("BALANCE: " + bal);

    System.out.print("NEW USERNAME (or press Enter to keep): ");
    sc.nextLine();
    String newUsername = sc.nextLine();
    if (!newUsername.isEmpty()) {
      user = newUsername;
    }

    System.out.print("NEW PHONE NUMBER (or press Enter to keep): ");
    String phoneInput = sc.nextLine();
    if (!phoneInput.isEmpty()) {
      phone = Long.parseLong(phoneInput);
    }

    System.out.print("NEW ADDRESS (or press Enter to keep): ");
    String newAddress = sc.nextLine();
    if (!newAddress.isEmpty()) {
      add = newAddress;
    }

    System.out.print("NEW ACCOUNT TYPE (or press Enter to keep): ");
    String newType = sc.nextLine();
    if (!newType.isEmpty()) {
      type = newType;
    }

    System.out.println("ACCOUNT DETAILS UPDATED");
  } 
  else 
  {
    System.out.println("WRONG PIN ENTERED");
  }
}
public static void transferAmount() 

{
 System.out.println();
 System.out.println("TRANSFER AMOUNT");
 System.out.print("ENTER RECIPIENT'S USERNAME: ");
 sc.nextLine(); // Clear buffer
 String recipientUser = sc.nextLine();
 System.out.print("ENTER AMOUNT TO TRANSFER: ");
 double transferAmount = sc.nextDouble();

 if (transferAmount <= bal)

 {

  bal -= transferAmount;
  tran.add("TRANSFERRED: " + transferAmount + " TO " + recipientUser);
  System.out.println("AMOUNT TRANSFERRED");
} 
else 
{
 System.out.println("INSUFFICIENT BALANCE");
}
}


public static void loan() 
{
  System.out.println();
  System.out.println("LOAN");
  System.out.print("ENTER LOAN AMOUNT: ");
  double loanAmount = sc.nextDouble();
  System.out.print("ENTER INTEREST RATE (%): ");
  double interestRate = sc.nextDouble();
  double totalAmount = loanAmount + (loanAmount * (interestRate / 100));
  bal += totalAmount;
  tran.add("LOAN TAKEN : " + loanAmount + " WITH INTEREST RATE " + interestRate + " % ");
  System.out.println("LOAN PROCESSED...");
}



}

