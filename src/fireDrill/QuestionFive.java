package fireDrill;

public class QuestionFive {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 4 == 0) {
                for (int counter = 0; counter <= 5; counter++){
                    System.out.print(number);
                }
                System.out.print(" ");
            }

        }
    }
}
