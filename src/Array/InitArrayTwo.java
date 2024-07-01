package Array;

public class InitArrayTwo {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; index++) {
            array[index] = 2 + 2 * index;
        }
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int index = 0; index < ARRAY_LENGTH; index++) {
            System.out.printf("%5d%8d%n", index, array[index]);
        }
    }
}
