package ObjectOrientedProgrammingConcepts;

public class Account {
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;
    private String accountNumber;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void deposit(double amount){
        if(amount < 0) throw new InvalidAmountException("Amount must be above zero");
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount > balance) throw new InsufficientBalanceException("Insufficient Account Balance");
    }
}
