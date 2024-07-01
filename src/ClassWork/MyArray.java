package ClassWork;

public class MyArray {
    int[] myArray = {2, 3, 5, 2, 5, 3};

    public void multiply() {
        int counter = 1;
        for (int index = 0; index < myArray.length; index++) {
            counter = myArray[index] * 2;
        }
        System.out.println(counter);
    }

    public int size() {
        return myArray.length;
    }
}
