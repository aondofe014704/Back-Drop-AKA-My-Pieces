package TestedAccount;

public class AccountBalanceIsTooLowException extends RuntimeException {
    public AccountBalanceIsTooLowException(String message) {
        super(message);
    }
}
