package testedCodes;

import Assignments.AutomaticBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testToTurnOnTheAutomaticBike(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.powerOff();
        assertTrue(automaticBike.powerOff());
    }
    @Test
    public void testToTurnOffTheAutomaticBike(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.powerOn();
        assertTrue(automaticBike.powerOn());
        automaticBike.powerOff();
        assertTrue(automaticBike.powerOff());
    }
    @Test
    public void testToIncreaseTheSpeedOfTheAutomaticBikeByOne_SpeedIncreased(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.powerOn();
        assertTrue(automaticBike.powerOn());
        automaticBike.increaseSpeed();
        assertEquals(1, automaticBike.checkSpeed());
    }
    @Test
    public void testToDecreaseTheSpeedOfTheAutomaticBikeByOne_SpeedDecreased(){
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.powerOn();
        assertTrue(automaticBike.powerOn());
        automaticBike.increaseSpeed();
        assertEquals(1, automaticBike.checkSpeed());
        automaticBike.decreaseSpeed();
        assertEquals(0, automaticBike.checkSpeed());
    }
    }
