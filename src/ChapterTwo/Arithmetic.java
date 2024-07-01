package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second Integer");
        int secondNumber = scanner.nextInt();
        int squareOfFirstNumber = firstNumber * secondNumber;
        int squareOfSecondNumber = secondNumber * secondNumber;
        System.out.printf("The sum of the square of the first number is %d%n", squareOfFirstNumber);
        System.out.printf("The sum of the square of the second number is %d%n", squareOfSecondNumber);

        int totalSumOfSquares = squareOfFirstNumber - squareOfSecondNumber;
        System.out.printf("The total difference %d%n", totalSumOfSquares);

    }
}
