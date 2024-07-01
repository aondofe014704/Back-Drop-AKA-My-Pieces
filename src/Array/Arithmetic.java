package Array;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Your first number ");
        int firstNumber = scanner.nextInt();
        System.out.println("please Enter Your second number ");
        int secondNumber = scanner.nextInt();
        int squareOfFirstNumber = firstNumber * firstNumber;
        System.out.println(squareOfFirstNumber);

        int squareOfSecondNumber = secondNumber * secondNumber;
        System.out.println(squareOfSecondNumber);


        int additionOfFirstAndSecondNumber = squareOfFirstNumber + squareOfSecondNumber;
        System.out.println(additionOfFirstAndSecondNumber);
        int minusOfFirstAndSecondNumber = squareOfFirstNumber - squareOfSecondNumber;
        System.out.println(minusOfFirstAndSecondNumber = squareOfFirstNumber - squareOfSecondNumber);

    }
}
