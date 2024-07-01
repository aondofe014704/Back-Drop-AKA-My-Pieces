package ChapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int one = scanner.nextInt();
        System.out.println(one);

        System.out.println("Enter second number");
        int two = scanner.nextInt();
        System.out.println(two);

        System.out.println("Enter third number");
        int three = scanner.nextInt();
        System.out.println(three);

        System.out.println("Enter fourth number");
        int four = scanner.nextInt();
        System.out.println(four);

        System.out.println("Enter fifth number");
        int five = scanner.nextInt();
        System.out.println(five);

        if (one > two && one < three && one < four && one < five){
            System.out.println("%d%n One is the smallest number");
        }
        else if (two < three && two < four && two < five && two < one){
            System.out.printf("%d%n Two is the smallest number");
        }
        else if (three < four && three < five && three < one && three < two){
            System.out.printf("%d%n Three is the smallest number");
        }
        else if (four < five && four < one && four < two && four < three){
            System.out.printf("%d%n Four is the smallest number");
        }
        else if (five < one && five < two && five < three && five < four){
            System.out.printf("%d%n Five is the smallest number");
        }
        if (one < two && one < three && one < four && one < five){
            System.out.printf("%d%n One is the largest number");



        }
        else if (two > three && two < four && two > five && two < one){
            System.out.printf("%d%n Two is the largest number");
        }
        else if (three > four && three > five && three > one && three > two){
            System.out.printf("%d%n Three is the largest number");
        }
        else if (four > five && four > one && four > two && four > three){
            System.out.printf("%d%n Four is the largest number");
        }
        else if (five > one && five > two && five > three && five > four){
            System.out.printf("%d%n Five is the largest number");
        }

    }


}
