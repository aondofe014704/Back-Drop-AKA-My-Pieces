package ChapterFour;

import java.util.Scanner;

public class GasMillageExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int milesDrivenTotal = 0 ;
        int gallonUsedTotal = 0;
        double result;
        boolean condition = true;
        while (condition){
            System.out.println("Enter miles driven");
            int milesDriven = scanner.nextInt();
            milesDrivenTotal += milesDriven;
            System.out.println("Enter gallon used");
            int gallonUsed = scanner.nextInt();
            gallonUsedTotal += gallonUsed;
            System.out.println("Do you want to continue [enter yes or no] ");
            String wishToContinue = scanner.next();
            if (wishToContinue.equalsIgnoreCase("NO")){
                condition = false;
            }
                while (!wishToContinue.equalsIgnoreCase("YES") && !wishToContinue.equalsIgnoreCase("NO")) {
                    System.out.println(" Enter Yes Or No ");
                    wishToContinue = scanner.next();
                }
        }
        result = (double) milesDrivenTotal / gallonUsedTotal;
        System.out.println(result);
    }
}
