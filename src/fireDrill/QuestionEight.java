package fireDrill;

import static java.lang.Long.sum;

public class QuestionEight {
    public static void main(String[] args) {
        double result = 0;
        for (int number = 1; number <= 10; number++) {
            if (number % 4 == 0) {
                for (int counter = 1; counter <= 5; counter++) {
                    result += Math.pow(number, counter);
                    result += sum(number, counter);
                }
                System.out.printf("%.0f", result);
                result = 0;
                System.out.print(" ");
            }
        }

    }
}
