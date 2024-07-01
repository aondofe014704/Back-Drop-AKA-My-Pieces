package Assignments;

import exception.AccountNumberNotFoundException;
import exception.AmountCannotBeLessThanZeroException;

import java.security.SecureRandom;
import java.util.ArrayList;

public class BankBank {
    private int numberOfCustomers;
    private final ArrayList<AccountAccount> listOfAccounts = new ArrayList<>();
   SecureRandom generatedAccountNumbers = new SecureRandom();
    public AccountAccount addCustomer(String firstName, String lastName) {
        AccountAccount account = new AccountAccount(firstName + " " + lastName, generateAccountNumbers());
        listOfAccounts.add(account);
        return account;
    }

    public int getNumberOFCustomers() {
        return listOfAccounts.size();
    }
    private AccountAccount findAccountWith(int accountNumber) {
        for(AccountAccount account : listOfAccounts){
            if(account.getAccountNumber() == accountNumber)return account;
        }
        throw new AccountNumberNotFoundException("Account Number Not Found");
    }

    public void deposit(int amount, int accountNumber) {
        AccountAccount foundAccountNumber = findAccountWith(accountNumber);
            if (amount < 0) throw new AmountCannotBeLessThanZeroException("amount must be above zero");
            foundAccountNumber.deposit(amount);
    }
    private int generateAccountNumbers(){
        return generatedAccountNumbers.nextInt(10);
    }
}

