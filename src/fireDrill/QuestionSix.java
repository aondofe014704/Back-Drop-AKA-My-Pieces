package fireDrill;
public class QuestionSix {
    public static void main(String[] args) {

        for (double number = 1; number <= 10; number++) {
            if (number % 4 == 0)
                for (int counter = 1; counter <= 5; counter++) {
                    System.out.printf("%.0f ", Math.pow(number, counter));
                }
            System.out.print(" ");
        }


            }
        }

