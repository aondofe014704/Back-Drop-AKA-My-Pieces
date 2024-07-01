package testedCodes;

import Assignments.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {
    @Test
    public void testToPowerOnTheTelevision_PowerIsOn(){
        Television television = new Television();
        television.powerOff();
        assertTrue(television.powerOff());
    }
    @Test
    public void testToPowerOffTheTelevision_PowerIsOff(){
        Television television = new Television();
        television.powerOn();
        assertTrue(television.powerOn());
        television.powerOff();
        assertTrue(television.powerOff());
    }
    @Test
    public void testToIncreaseTelevisionVolume_VolumeIsIncreased(){
        Television television = new Television();
        television.powerOn();
        assertTrue(television.powerOn());
        television.increaseVolume();
        assertEquals(1, television.checkVolume());
    }
    @Test
    public void testToDecreaseTelevisionVolume_VolumeDecreased() {
        Television television = new Television();
        television.powerOn();
        assertTrue(television.powerOn());
        television.increaseVolume();
        television.decreaseVolume();
        assertEquals(0, television.checkVolume());
    }
    @Test
    public void testToChangeTheChannelOfTheTelevisionWithPositiveIntegers(){
        Television television = new Television();
        television.powerOn();
        assertTrue(television.powerOn());
        television.changeChannel();
        assertEquals(2, television.checkChannel());
    }
    @Test
    public void testToChangeTheChannelTheTelevisionChannelwithNegativeIntegers() {
        Television television = new Television();
        television.powerOn();
        assertTrue(television.powerOn());
        television.changeChannel();
        assertEquals(2, television.checkChannel());
    }
    }
