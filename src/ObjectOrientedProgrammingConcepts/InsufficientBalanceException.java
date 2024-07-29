package ObjectOrientedProgrammingConcepts;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String response) {
        super(response);
    }
}
