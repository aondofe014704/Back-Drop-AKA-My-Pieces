package Array;

public class SummingValues {
    public static void main(String[] args) {
        int [] myArray = {20, 56, 61, 98, 100, 21};

        int total = 0;

        for(int counter = 0; counter < myArray.length; counter++) {
            total += myArray[counter];
        }
        System.out.printf("%d%n", total);
    }
}
