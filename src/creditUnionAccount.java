// creating class CreditUnionAccount

public class CreditUnionAccount
{
   // Creating Instance Variables needed
   private  int accNumber; 
   private String custName;
   private double shareBalance;  
   private double loanBalance;
   private int loanDuration;
   private static int nextAccNo = 1000;
   private final double WELCOME_BALANCE = 50.00; 
      
   // Creating 2 Constructors:1st with all instance variables set to their default values, 
   // 2nd constructor accepts user's input for shareBalance and custName
   
   public CreditUnionAccount()
   {
      accNumber = nextAccNo++;        // different account numbers
      shareBalance = WELCOME_BALANCE;  
      loanBalance = 0;
      custName =  "";
      loanDuration = 0;

   }
   
   public CreditUnionAccount(String name,double balance)
   {
      accNumber = nextAccNo++;
      custName = name;
      shareBalance = WELCOME_BALANCE + balance;  
      loanBalance = 0;
      loanDuration = 0;
   }

   //Methods
   //Set methods for  the instance varaibles
   
   public void setCustName(String n)
   {
      custName = n;
   }
   
   public void setShareBalance(double bal)
   {
      shareBalance = WELCOME_BALANCE + bal;
   }
   
   public void setLoanBalance(double loan)
   {
      loanBalance = loan;
   }
   
   public void setLoanDuration(int duration)
   {
      loanDuration = duration;
   }
    
   //Get methods for instance varaibles
      
   public int getAccountNumber()
   {
      return accNumber;
   } 
        
   public String getCustName()
   {
      return custName;
   }
            
   public double getShareBalance()
   {
      return shareBalance;
   }
          
   public double getLoanBalance()
   {
      return loanBalance;
   }
   
   public int getLoanDuration()
   {
      return loanDuration;
   }
   //Other methods  
      
   public void depositToShares (double deposit)
   {
      shareBalance = shareBalance + deposit;
      System.out.print("You have now " + shareBalance + " funds in your account");
   }
      
   public void makeLoanPayment (double repayment)
   {
      if(repayment > loanBalance)
      {
         System.out.print("You cannot pay more then " + loanBalance + " towards your loan");
      }
      else
      {
         loanBalance = loanBalance - repayment;
         System.out.println("You have paid " + repayment + " towards your loan");
         System.out.println("You have left " + loanBalance + " to pay");
      }
    }
      
   public void withdrawFromShares (double withdraw)
   {
      if(withdraw > (shareBalance - loanBalance))
      {
      System.out.println("Insufiicent funds");
      System.out.println("You can only withdraw up to " + (shareBalance - loanBalance));
      }
      else
      {
      shareBalance = shareBalance - withdraw;
      System.out.println("You have withdrew " + withdraw);
      System.out.println("You have left " + (shareBalance - loanBalance) + " funds available to withdraw");
      }
   }
      
   public void issueLoan (double loan, int duration)
   {
      if(loanBalance != 0)         //assumption made that customer can only  have 1 loan at time
      {
         System.out.print("Loan not approved, you already have a loan with us");
      }
      else 
      {
         if(loan < (shareBalance *3))
         {
            loanBalance = loan;
            loanDuration = duration;
            System.out.println("You have borrowed " + loanBalance + " for " + loanDuration + " months");
         }
         else
         {
            System.out.print("We are sorry loan not approved, You can borrow only up to " + (shareBalance *3));
         }
      }
   }
         
   public double calcWeeklyLoan()
   {
         return   loanBalance/(loanDuration * 4);   // assumption that we have 4 weeks in a month
   }
      
   public double calcMonthLoan()
   {
      
     return loanBalance/loanDuration;
   }
      
   public String toString()
   {
      return "Account No: "+ accNumber +  "\nCustomer Name: "+ custName
      + "\nAccount Balance: "+ shareBalance + "\nLoan Balance: "+ loanBalance + "\nLoan Duration: "+ loanDuration;
   }
}

      