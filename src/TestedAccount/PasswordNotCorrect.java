package TestedAccount;

public class PasswordNotCorrect extends RuntimeException{
    public PasswordNotCorrect(String response) {
        super(response);
    }
}
