//Hanna Kausa L00169902


// import library utilities to use Scanner class
import java.util.*;

// create public class and main method
public class CreditUnionAccountTester
{ 
   public static void main(String args[])
   {
      // declare variables needed
      int option;
      double bal;
      String cName;
      Scanner keyboardIn = new Scanner(System.in);
           
      System.out.println("Welcome to Credit Union Account"); 
        
      System.out.println("Please enter your Customer Name: ");
      cName = keyboardIn.nextLine();
        
      System.out.println("Please enter amount you want to add to your Balance: ");
      bal = keyboardIn.nextDouble();
      // while loop to validate user's input
      while( bal <= 0)
      {
         System.out.println("Invalid input"); 
         System.out.println("Please enter correct amount you want to add to your Balance: ");  
         bal = keyboardIn.nextDouble();
      } 
       
      // creating object account1 using  2nd constructor from my CreditUnionAccount class
      
      CreditUnionAccount account1 = new CreditUnionAccount(cName, bal);
      
      // Testing set methods from CreditUnionAccount class to set values for instance variables,
      // except accNumber which is set with a static variable increments,
      
      account1.setCustName("Joe Black");
      account1.setShareBalance(300.00);
      account1.setLoanBalance(100.00);
      account1.setLoanDuration(24);
      // checking the result of set methods
      System.out.println(account1.toString());
        
      System.out.println("Please choose one of the following options: ");
       
      // menu below is testing all other methods from the class
      // do-while loop to continue to display menu until user exits the system
      do
      {   
         System.out.println(" ");
         System.out.println("********************CREDIT UNION ACCOUNT**************************");
         System.out.println(" ");
         System.out.println("1. View Account Details");
         System.out.println("2. View Account Number and Customer Name");
         System.out.println("3. View Share Balance");
         System.out.println("4. View Loan Balance");              
         System.out.println("5. Deposit to Shares");
         System.out.println("6. Withdraw from Shares");
         System.out.println("7. Apply for Loan");
         System.out.println("8. Make Loan Repayment");
         System.out.println("9. View Weekly Loan Repayment");
         System.out.println("10. View Monthly Loan Repayment");
         System.out.println("0. Exit System");
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("Please choose one of these options: ");
         System.out.println("******************************************************************");
            
         // assigning  option  from user's input
         option = keyboardIn.nextInt(); 
            
         while(option <0 || option >10)
         {
            System.out.println("Invalid option chosen \nPlease choose options from 1 till 10 or 0 to exit");
            option = keyboardIn.nextInt();
         } 
            
                 
         // swich structure to assign chosen option with desired action performed on the account1 as a testing object                      
         switch(option)
         {
            case 1:
                  
               System.out.println(account1.toString()); 
               break;  
                  
            case 2:
               System.out.println("Your Account Number is " + account1.getAccountNumber());
               System.out.println("Your Customer Name is " + account1.getCustName());
               break;
                  
            case 3:
               System.out.println("Your Share Balance is: " + account1.getShareBalance());
               break; 
                  
            case 4:
               System.out.println("Your Loan Balance is " + account1.getLoanBalance());
               break; 
                  
            case 5:
               System.out.println("How much do you want to deposit to you account?");
               double deposit = keyboardIn.nextDouble();
               
              //while structure to validate users input
               while( deposit <= 0)
               {
                  System.out.println("Invalid input"); 
                  System.out.println("Please enter amount you want to deposit: ");  
                  deposit = keyboardIn.nextDouble();
               } 
            
               account1.depositToShares(deposit);
               break; 
                  
            case 6:
               System.out.println("How much do you want to withdraw from your account?");
               double withdraw = keyboardIn.nextDouble();
                  
              //while structure to validate users input
               while( withdraw <= 0)
               {
                  System.out.println("Invalid input"); 
                  System.out.println("Please enter amount you want to withdraw: ");  
                  withdraw = keyboardIn.nextDouble();
               } 
                  
               account1.withdrawFromShares(withdraw);
               break; 
                  
            case 7:
               System.out.println("How Much do you want to borrow?");
               double loan = keyboardIn.nextDouble();
                                   
              //while structure to validate users input  
               while( loan <= 0)
               {
                  System.out.println("Invalid input"); 
                  System.out.println("Please enter amount you want to borrow: ");  
                  loan = keyboardIn.nextDouble();
               } 
            
               System.out.println("How many MONTHS do you want the loan for");
               int duration= keyboardIn.nextInt();
                   
               // assumption made that loan cannot be taken for less than 12 month   
               while( duration < 12)
               {
                  System.out.println("Invalid input"); 
                  System.out.println("Please enter number of months for you loan(minimum 12 months): ");  
                  duration = keyboardIn.nextInt();
               } 
               account1.issueLoan(loan,duration);
                 
               break; 
                  
            case 8:
               System.out.println("How much do you want to repay: ");
               double repayment = keyboardIn.nextDouble();
                  
               while(repayment <= 0)
               {
                  System.out.println("Invalid input"); 
                  System.out.println("Please enter amount you want to pay towards your loan: ");  
                  repayment = keyboardIn.nextDouble();
               } 
                  
               account1.makeLoanPayment(repayment);
               break; 
                  
            case 9:
               System.out.println("Your Weekly Loan Repayment will be " + account1.calcWeeklyLoan());
               break; 
                  
            case 10:
               System.out.println("Your monthly Loan Repayment will be " + account1.calcMonthLoan());
               break; 
                  
            case 0:
               System.out.println("Thank you for using Credit Union Account System and Goodbye");
               break; 
         }
         // finish of  the first do-while loop and user can exit the system if '0' chosen      
      }while (option != 0);
   }
}
               

