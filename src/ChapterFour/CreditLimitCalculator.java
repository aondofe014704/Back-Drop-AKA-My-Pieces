package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Account Number");
        int accountNumber = scanner.nextInt();
        System.out.println("Balance at the beginning of the month");
        int beginningBalance = scanner.nextInt();
        System.out.println("Enter customer charges");
        int customerCharges = scanner.nextInt();
        System.out.println("Enter total credit applied to customer account");
        int totalCredit = scanner.nextInt();
        System.out.println("Enter allowed credit");
        int allowedCredit = scanner.nextInt();

        int newBalance = beginningBalance + customerCharges - totalCredit;


    }
}