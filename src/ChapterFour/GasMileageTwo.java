package ChapterFour;

import java.util.Scanner;

public class GasMileageTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesDriven = 0;
        int totalMiles = 0;
        int gallonsUsed = 0;
        int milePerGallon;
        int totalGallons = 0;
        int combinedMilesPerGallon = 0;
        String prompt = "yes";
        while (true) {
            System.out.println("Enter number of miles Driven: ");
            milesDriven = scanner.nextInt();
//            totalMiles = milesDriven + 1;
//            System.out.println(totalMiles);

            System.out.println("Enter number of gallons used: ");
            gallonsUsed = scanner.nextInt();

            milePerGallon = milesDriven / gallonsUsed;
            combinedMilesPerGallon += milePerGallon;

            System.out.println("Do you wish to continue? Enter no to end");
            prompt = scanner.nextLine();
            if (!prompt.equals("yes"))
                break;
            System.out.println("Enter number of miles Driven");
            milesDriven = scanner.nextInt();
            System.out.println("Enter number of gallons used");
            gallonsUsed = scanner.nextInt();

            milePerGallon = milesDriven / gallonsUsed;
            combinedMilesPerGallon += milePerGallon;

        }


//            totalGallons = gallonsUsed + 1;
//            System.out.println(totalGallons);


    }
}
