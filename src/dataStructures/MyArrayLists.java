package dataStructures;

public class MyArrayLists implements MyArrayList{
    private boolean isEmpty = true;
    private int size = 0;
    private String element;
    private int capacity = 3;  // initial capacity of the array, can be adjusted as needed. 3 is just a starting point.
    private  final String[] arrayOfElements = new String [capacity];
    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(String element) {
        for (int i = 0; i < size-1; i++) {
           if (arrayOfElements[i].equals(element)) {
                size--;
            }
        }
    }

    @Override
    public int remove(int index) {
        return size--;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(String element) {
        return false;
    }

    @Override
    public String get(int index) {
        return element;
    }

    @Override
    public void add(String element) {
        this.element = element;
          arrayOfElements[size] = element;
           size++;
           capacity--;

    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) isEmpty = false;
        return isEmpty;
    }
}
