package Assignments;
import exception.InvalidAmountException;
import exception.NewInsufficientBalanceException;


public class Account {
    private String firstName;
    private String lastName;
    private String pin;
    private int balance = 0;

    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount <= 0) throw new NewInsufficientBalanceException("insufficient balance");
        if(amount > 0 ){
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if(amount >  balance || amount < 0) throw new InvalidAmountException("Invalid amount");
        if(amount <= balance) balance -= amount;

    }

    public void transfer(Account senderAccount, Account recipientAccount, int depositAmount) {

    }
}
