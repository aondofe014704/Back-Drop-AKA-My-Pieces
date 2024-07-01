package NewPackageForNewAccount;

public class Account {
    private String accountName;
    private double balance;
    private String password;
    private int accountNumber;

    public double checkBalance(String password) {
        return balance;
    }

    public void deposit(int amount) {
        if(amount <= 0) throw new AmountMustBeGreaterZeroException("Amount Must Be Greater Than Zero");
        balance += amount;
    }

    public void withdraw(int amount, String password) {
        if(amount > balance) throw new InsufficientBalanceException("Insufficient Balance");
        if(balance >= amount){
            balance = balance - amount;
        }
    }
}
