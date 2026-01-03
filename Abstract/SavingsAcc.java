package Abstract;

public class SavingsAcc extends BankACC{

    @Override
    public void deposits(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }

    public SavingsAcc(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}
