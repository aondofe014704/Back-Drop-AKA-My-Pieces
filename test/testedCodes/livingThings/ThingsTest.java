package testedCodes.livingThings;

import ObjectOrientedProgrammingConcepts.Things;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ThingsTest {
    @Test
    public void testThatClassThingsExist(){
        Things things = new Things();
        assertNotNull(things);
    }
}
