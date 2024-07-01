package NewPackageForNewAccount;

public class AmountMustBeGreaterZeroException extends RuntimeException {
    public AmountMustBeGreaterZeroException(String response) {
        super(response);
    }
}
