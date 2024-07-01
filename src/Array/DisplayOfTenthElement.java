package Array;

public class DisplayOfTenthElement {
    public static int number = 0;
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        number = tenthElement(myArray);
        System.out.println(number);

    }

    public static int tenthElement(int[] myArray) {
        number = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (index == 9) {
                number = myArray[index];
            }
        }
        return number;
    }
}
