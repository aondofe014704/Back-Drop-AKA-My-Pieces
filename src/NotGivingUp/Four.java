package NotGivingUp;

public class Four {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++){
            if(number % 4 == 0){
                System.out.print(number);
            }
            System.out.print(" ");
        }
    }
}
