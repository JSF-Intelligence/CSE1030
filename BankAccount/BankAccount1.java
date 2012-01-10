/**
 * Bank account class
 */

public class BankAccount1
{

   // Attributes.
   private double balance;

   // Constructor(s)
   /**
    * Creates a bank account with the given balance which
    * should be greater than 0.
    * @param balance The initial balance in this account.
    * @throws Exception If the balance is negative.
    */

   public BankAccount1(double balance) throws Exception
   {
      if (balance >= 0)
      {
         this.balance = balance;
      }
      else
      {
         throw new Exception("Balance cannot be negative!");
      }
   }

   /**
    * Creates a bank account with a 0 balance.
    */

   public BankAccount1()
   {
      this.balance = 0;
   }

   // Methods.

   // Accessor methods.

   /**
    * Returns the balance of this account.
    * @return The balance of this account.
    */

   public double getBalance()
   {
      return this.balance;
   }

   // Mutator methods

   /**
    * Withdraw the passed amount.
    * The resulting balance can't be negative.
    * @param amount The amount to be withdrawn.
    * @pre. current balance must be >= amount.
    */

   public void withdraw(double amount)
   {
      balance -= amount;
      if (balance < 0)
      {
         System.out.println("Can't you read?");
      }
      return;
   }

   /**
    * Deposits the passed amount into the account.
    * This amount must not be negative.
    * @param amount The amount to be deposited.
    * @return <code>true</code> if the deposit is
    *    successful and <code>false</code> otherwise.
    */

   public boolean deposit(double amount)
   {
      if (amount >= 0)
      {
         balance += amount;
         return true;
      }
      return false;
   }
}

