package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    public void testToCreateANewList_NewListIsEmpty() {
        MyArrayLists myArrayLists = new MyArrayLists();
        assertTrue(myArrayLists.isEmpty());
    }

    @Test
    public void testToAddElementsToNewList_ListIsNotEmpty() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        assertEquals(1, myArrayLists.size());
        assertFalse(myArrayLists.isEmpty());
    }

    @Test
    public void testToAddTwoElements_ListIncreased() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        assertEquals(2, myArrayLists.size());
    }

    @Test
    public void testToAddTwoElentsRemove_OneListDecreased() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        assertEquals(2, myArrayLists.size());
        myArrayLists.remove("Apples");
        assertEquals(1, myArrayLists.size());
    }

    @Test
    void testThatisEmptyMethodIsFalseWhenAddedValue() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        assertFalse(myArrayLists.isEmpty());
    }

    @Test
    public void testThatArrayListsReturnsTheValueOfTheGivenIndex() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        assertEquals("Oranges", myArrayLists.get(1));
    }

    @Test
    public void testThatArrayListsRemovesAnElementFromAGivenIndex() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        myArrayLists.remove(0);
        assertEquals(1, myArrayLists.size());
    }

    @Test
    public void testThatArrayIndexReturnsTheElementInAGivenIndex() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        assertEquals("Oranges", myArrayLists.get(0));
    }
    @Test
    public void testToKnowTheCapacityOfTheArrayLists(){
        MyArrayLists myArrayLists = new MyArrayLists();
        assertEquals(3, myArrayLists.capacity());
    }
    @Test
    public void testThatArrayListsReducesCapacityAsElementAreBeenAdded() {
        MyArrayLists myArrayLists = new MyArrayLists();
        myArrayLists.add("Apples");
        myArrayLists.add("Oranges");
        myArrayLists.add("Mangoes");
        assertEquals(0, myArrayLists.capacity());
    }
}