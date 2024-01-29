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

      