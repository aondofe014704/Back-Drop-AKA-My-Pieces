package Assignments;

import java.util.Random;

public class AccountHolder {
    private Long id;
    private String firstname;
    private String lastname;
    private String password;
    private String username;
    private boolean login;
    private boolean logout;
    private String accountNumber;

    private void generateAccountNumber() {
        this.accountNumber = generateRandomAccountNumber();
    }

    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();
        String account = accountHolder.generateRandomAccountNumber();
        System.out.println(account);
    }

    private String generateRandomAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumberBuilder = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            accountNumberBuilder.append(random.nextInt(10));
        }

        return accountNumberBuilder.toString();
    }
}
