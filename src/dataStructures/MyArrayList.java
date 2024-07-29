package dataStructures;

public interface MyArrayList {
    int size();
   void remove(String element);

   int remove(int index);
   void clear();
   boolean contains(String element);
   String get(int element);
   void add(String element);
   int capacity();
   boolean isEmpty();
}
