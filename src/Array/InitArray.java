package Array;

public class InitArray{
    //Creating an Array Element of The Specified;
    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.printf("%s8s%n", "index", "value");


        for(int love = 0; love < 10; love++){
            System.out.printf("%5d%8d%n", love, myArray[love]);
        }
    }
}