package Abstract;

public class abstractMain {
    static void main(String[] args) {
        SavingsAcc savingacc = new SavingsAcc("12345678",23333);
        savingacc.deposits(100);

        BankACC savingacc1 = new SavingsAcc("qwertyuiop",777888);
        savingacc1 = new CurrentAcc("asdfghj",900);
        savingacc1.deposits(200);

        System.out.println(savingacc1.getAccountNumber());
        savingacc1 = new SavingsAcc("SAVINGS: ",1000);
        System.out.println(savingacc1.getAccountNumber());


    }
}
