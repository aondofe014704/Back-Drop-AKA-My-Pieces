package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesDriven = 0;
        int gallonsUsed = 0;
        double average = 0.0;
        int stop = 0;
        int total = 0;

        System.out.println("Enter a new number to start");
        stop = scanner.nextInt();
        while (stop != -1) {
            System.out.println("Enter Miles Driven:");
            milesDriven = scanner.nextInt();
            System.out.print("Enter gallon used: ");
            gallonsUsed = scanner.nextInt();
           double milePerGallon = (double) milesDriven / gallonsUsed;
            average += milePerGallon;
            System.out.printf("The Miles per gallon is equal to %d%n", gallonsUsed);
            System.out.print("Enter -1 to stop: ");
            stop = scanner.nextInt();
        }

            System.out.printf("%nTotal of number of milesDriven is %d%n", total);
            System.out.printf("The average of The %.2f", average);

    }
}
