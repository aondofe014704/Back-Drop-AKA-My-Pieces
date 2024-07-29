package TestedAccount;

public class AmountMustBeGreaterThanZero extends RuntimeException {
    public AmountMustBeGreaterThanZero(String message) {
        super(message);
    }
}
