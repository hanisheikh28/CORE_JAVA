package Abstract;

 public class CurrentAcc extends BankACC {
     @Override
     public void deposits(double amount) {
         System.out.println("Deposited Current");
     }

     @Override
     public void withdraw(double amount) {
         System.out.println("Withdrawn current");

     }

     public CurrentAcc(String accountNumber, double balance) {
         super(accountNumber, balance);
     }
 }
