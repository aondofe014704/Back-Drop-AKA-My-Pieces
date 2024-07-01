package testedCodes;

import ClassWork.AirCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void testToTurnOnTheAirCondition(){
        AirCondition airCondition = new AirCondition();
        airCondition.powerOff();
        assertFalse(airCondition.powerOff());
        airCondition.powerOn();
        assertTrue(airCondition.powerOn());
    }
    @Test
    public void testToTurnOffTheAirCondition(){
        AirCondition airCondition = new AirCondition();
        airCondition.powerOn();
        assertTrue(airCondition.powerOn());
        airCondition.powerOff();
        assertFalse(airCondition.powerOff());
    }
    @Test
    public void testToIncreaseTheTemperatureOfTheAirCondition(){
        AirCondition airCondition = new AirCondition();
        airCondition.powerOn();
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.checkTemperature());
    }
    @Test
    public void testToDecreaseTheTemperatureOfTheAirCondition(){
        AirCondition airCondition = new AirCondition();
        airCondition.powerOn();
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.checkTemperature());
    }

}
