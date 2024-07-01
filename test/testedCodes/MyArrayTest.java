package testedCodes;

import ClassWork.MyArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayTest {
    @Test
    public void testToCreateMyArray(){
        MyArray myArray = new MyArray();
        myArray.multiply();
        assertEquals(4, myArray.size());
    }
}
