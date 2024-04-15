package Exercise_5;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(double balance,String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit( double amount){
        balance = balance + amount;
    }

    public void withDraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(int i) {
    }
}
