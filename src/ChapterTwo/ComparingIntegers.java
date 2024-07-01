package ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int oneNumber = scanner.nextInt();
        System.out.println(oneNumber);
        int squareOfOneNumber = oneNumber * oneNumber;
        System.out.println(squareOfOneNumber);

        if (oneNumber > 100 && squareOfOneNumber > 100) {
            System.out.println(squareOfOneNumber + " is greater than 100");
        }
        else if (oneNumber < 100 && squareOfOneNumber < 100) {
            System.out.println(squareOfOneNumber + " is less than 100");
        }
        else if (oneNumber == 100 && squareOfOneNumber == 100) {
            System.out.println(squareOfOneNumber + " is equal to 100");
        }
         else if (oneNumber!= 100 && squareOfOneNumber!= 100) {
            System.out.println(squareOfOneNumber + " is not equal to 100");
        }
    }
}
