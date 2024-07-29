package NewPackageForNewAccount;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> listOfAccounts = new ArrayList<Account>();
    private int numberOfCustomers;


    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void addCustomer(String accountName, String password, String phoneNumber) {
        Long accountNumber = generateAccountNumber(phoneNumber);
        Account account = new Account(accountName, password, accountNumber);
        listOfAccounts.add(account);
        numberOfCustomers++;
    }
    private Long generateAccountNumber(String accountNumber){
        Long accountDetails = Long.parseLong(accountNumber.substring(1));
        return accountDetails;
    }

    public double checkBalance(Long accountNumber, String password) {
        Account account = findAccount(accountNumber);
        double balance = 0.0;
        balance = account.checkBalance(password);
        return balance;


    }
    private Account findAccount(Long accountNumber){
        for(Account account : listOfAccounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void deposit(double amount, Long accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(double amount, long accountNumber, String password) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, password);
    }

    public void transfer(double amount, long senderAccount, Long receiverAccount, String senderPassword) {
        Account sender = findAccount(senderAccount);
        Account receiver = findAccount(receiverAccount);
        sender.withdraw(amount, senderPassword);
        receiver.deposit(amount);
        }
}
