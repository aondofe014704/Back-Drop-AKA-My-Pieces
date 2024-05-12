package NotGivingUp;

public class Five {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 4 == 0) {
                for (int counter = 1; counter <= 6; counter++){
                    System.out.print(number);

                }
                System.out.print(" ");
            }
        }
    }
}
