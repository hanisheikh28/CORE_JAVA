package Abstract;

public class KidsAcc extends BankACC {

    public KidsAcc(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposits(double amount) {
        System.out.println("Deposits");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }
}
