package NotGivingUp;

public class Six {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 4 == 0) {
                for (int counting = 1; counting <= 6; counting++){
                    System.out.printf("%.0f", Math.pow(number, counting));
                }
                System.out.print("  ");

            }

        }
    }
}
