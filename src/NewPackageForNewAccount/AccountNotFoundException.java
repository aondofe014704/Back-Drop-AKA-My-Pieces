package NewPackageForNewAccount;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String response) {
        super(response);
    }
}
