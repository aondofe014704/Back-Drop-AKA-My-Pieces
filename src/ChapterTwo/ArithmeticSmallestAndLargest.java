package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstInteger = scanner.nextInt();
        System.out.println("Enter second integer");
        int secondInteger = scanner.nextInt();
        System.out.println("Enter third integer");
        int thirdInteger = scanner.nextInt();

        int sumOf3Integers = firstInteger + secondInteger + thirdInteger;
        System.out.println(sumOf3Integers);

        int averageOf3Integers = sumOf3Integers / 3;
        System.out.println(averageOf3Integers);

        int productOf3Integers = firstInteger * secondInteger * thirdInteger;
        System.out.println(productOf3Integers);

        if (firstInteger < secondInteger && firstInteger < thirdInteger) {
            System.out.printf("%d%n", firstInteger);
        }
        if (secondInteger < firstInteger && secondInteger < thirdInteger) {
            System.out.printf("%d%n", secondInteger);
        }
        if (thirdInteger < firstInteger && thirdInteger < secondInteger) {
            System.out.printf("%d%n", thirdInteger);
        }

        if (firstInteger > secondInteger && firstInteger > thirdInteger) {
            System.out.printf("%d%n", firstInteger);
        }
        if (secondInteger > firstInteger && secondInteger > thirdInteger) {
            System.out.printf("%d%n", secondInteger);
        }
        if (thirdInteger > firstInteger && thirdInteger > secondInteger) {
            System.out.printf("%d%n", thirdInteger);
        }

    }
}
