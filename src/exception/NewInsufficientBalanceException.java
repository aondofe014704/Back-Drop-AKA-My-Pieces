package exception;

public class NewInsufficientBalanceException extends RuntimeException {
    public NewInsufficientBalanceException(String message){
        super(message);
    }

}
