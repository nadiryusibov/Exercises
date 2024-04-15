package Exercise_5;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount < 100){
            System.out.println("Minimum balance of 100$ required !");
        }else {
            super.withDraw(amount);
        }
    }
}
