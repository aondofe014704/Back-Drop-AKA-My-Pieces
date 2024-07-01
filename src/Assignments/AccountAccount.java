package Assignments;

import exception.AmountCannotBeLessThanZeroException;
import exception.InsufficientBalanceException;

public class AccountAccount {
    private int balance;
    private String pin;
    private int accountNumber;
    private String accountName;
  public AccountAccount(String accountName, int accountNumber){
      this.accountNumber = accountNumber;
      this.accountName = accountName;

  }
  public AccountAccount(String accountName, int accountNumber, String password){
      this.accountNumber = accountNumber;
      this.accountName = accountName;
      this.pin = password;
  }
  public AccountAccount(){

  }

    public void deposit(int amount) {
        if(amount < 0) throw new AmountCannotBeLessThanZeroException("Amount Cannot be less than zero");
        this.balance += amount;
    }
    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount){
        if (amount > this.balance) throw new InsufficientBalanceException("Insufficient Balance");
        this.balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
