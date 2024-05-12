package fireDrill;

import java.util.Scanner;

public class NineBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10){
            System.out.println("Enter your grade scores");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;

        }
        int average = total / 10;
        System.out.printf("%n The total of students in the class is %d%n", total);
        System.out.printf("The average of the class is %d%n", average);
    }
}
