package ChapterFour;

import java.util.Scanner;

public class GasMileageAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;
        double result = 0;
        boolean condition = true;
        while (condition) {
            System.out.println("Enter miles Driven");
            int milesDriven = scanner.nextInt();
            totalMilesDriven += milesDriven;
            System.out.println("Enter gallonsUsed");
            int gallonsUsed = scanner.nextInt();
            totalGallonsUsed += gallonsUsed;
            System.out.println("want to continue[press Yes to continue and No to Quit]");
            String wantToContinue = scanner.next();
            if (wantToContinue.equalsIgnoreCase("No")) {
                condition = false;
            }
            while (!wantToContinue.equalsIgnoreCase("Yes") && !wantToContinue.equalsIgnoreCase("No")) ;
            System.out.println(" Enter Yes Or No ");
            wantToContinue = scanner.next();
        }
        result = (double) totalMilesDriven / totalGallonsUsed;
        System.out.printf("%n The average miles Driven is %d%n ", result);

    }
}


