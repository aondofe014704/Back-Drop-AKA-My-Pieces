package TestedAccount;

public class Account {
    private int balance;
    private String pin;

    public void setPin(String pin) {
         this.pin = pin;
    }

    private int accountNumber;
    private String accountName;
    public int checkBalance(String pin) {
        validatePassword(pin);
        return balance;
    }

    private void validatePassword(String pin) {
        if(!pin.equals(this.pin)) throw new PasswordNotCorrect("Incorrect password");
    }

    public void getAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void getAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        if(amount < 0) throw new AmountMustBeGreaterThanZero("amount must be greater than zero");
        if(amount >= balance)
            balance += amount;
        }

    public void withdraw(int amount, String pin) {
        validatePassword(pin);
        if(amount > balance) throw new AccountBalanceIsTooLowException("amount must be greater than");
        balance -= amount;
//        if(amount >= balance)
//        if(pin.equals(this.pin) throw new PasswordNotCorrect("Incorrect password");
//        if(pin != pin) throw new PasswordNotCorrect("Invalid Password");
    }
}
