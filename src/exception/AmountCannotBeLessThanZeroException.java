package exception;

public class AmountCannotBeLessThanZeroException extends RuntimeException {
    public AmountCannotBeLessThanZeroException(String message) {
        super(message);
    }
}
