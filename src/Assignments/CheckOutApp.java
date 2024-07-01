package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {

    public static void main(String[] args) {
        String customerName = "";
        ArrayList<String> namesOfProduct = new ArrayList<String>();
        ArrayList<Integer> numberOfItems = new ArrayList<Integer>();
        ArrayList<Integer> priceOfItems = new ArrayList<Integer>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer Name");
        customerName = scanner.nextLine();

        System.out.println("Enter names of product bought");
        String product = scanner.nextLine();
        namesOfProduct.add(product);
        String productNames = "";
        for (int index = 0; index < namesOfProduct.size(); index++){
            productNames += namesOfProduct.get(index);


        }

        System.out.println("Enter the number of Items Bought");
        int items = scanner.nextInt();
        numberOfItems.add(items);
        int productItems = 0;
        for (int number = 0; number < numberOfItems.size(); number++){
            productItems += numberOfItems.get(number);

        }

        System.out.println("Enter price of Items Bought");
        int price = scanner.nextInt();
        priceOfItems.add(price);
        int total = 0;
        for (int i = 0; i < priceOfItems.size(); i++){
            total += priceOfItems.get(i);
        }

    }
}
