package fireDrill;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        System.out.println("Enter grade or -1 to Quit: ");
        int grade = scanner.nextInt();
        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;


            System.out.println("Enter grade or -1 to Quit: ");
            grade = scanner.nextInt();

        }
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }else {
            System.out.println("No grades were Entered");
        }
    }
}
