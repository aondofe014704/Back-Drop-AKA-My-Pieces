package fireDrill;

import java.util.Scanner;

public class TenB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        while (gradeCounter != -1){
            System.out.println("Enter Your Grade or -1 to Quit");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("Enter Your Grade or -1 to Quit");
            grade = scanner.nextInt();
        }
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", total, gradeCounter);
        }else {
            System.out.println("No grades were entered");
        }

    }
}
