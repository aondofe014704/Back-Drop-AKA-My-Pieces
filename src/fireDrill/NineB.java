package fireDrill;

import java.util.Scanner;

public class NineB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10){
            System.out.println("Enter your Scores");
            int input = scanner.nextInt();
            total = total + input;
            gradeCounter = gradeCounter + 1;
        }
        int average = total / 10;
        System.out.printf("%nThe total of all ten students is %d%n", total);
        System.out.printf("The average of the scores in the class is %d%n", average);

    }
}
