package NewPackageForNewAccount;

public class Account {
    private String accountName;
    private double balance;
    private String password;
    private Long accountNumber;
    public Account(String accountName, String password, Long accountNumber) {
        this.accountName = accountName;
        this.password = password;
        this.accountNumber = accountNumber;
    }
    public Account(){

    }

    public double checkBalance(String password) {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) throw new AmountMustBeGreaterZeroException("Amount Must Be Greater Than Zero");
        balance += amount;
    }

    public void withdraw(double amount, String password) {
        if(amount > balance) throw new InsufficientBalanceException("Insufficient Balance");
        if(balance >= amount){
            balance = balance - amount;
        }
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }
}
