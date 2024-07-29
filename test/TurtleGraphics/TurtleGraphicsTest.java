package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.EAST;
import static TurtleGraphics.Direction.SOUTH;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleGraphicsTest {
    @Test
    public void testThatPenIsUpByDefault() {
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        assertTrue(turtleGraphics.penIsUp());
    }
    @Test
    public void testThatPenIsDown() {
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        turtleGraphics.penIsUp();
        assertTrue(turtleGraphics.penIsUp());
        turtleGraphics.penIsDown();
        assertTrue(turtleGraphics.penIsDown());
    }
    @Test
    public void testThatPenIsUp() {
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        turtleGraphics.penIsUp();
        assertTrue(turtleGraphics.penIsUp());
        turtleGraphics.penIsDown();
        assertTrue(turtleGraphics.penIsDown());
    }
    @Test
    public void testThatToTurnDirectionToRight(){
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        assertSame(EAST, Direction.EAST.getDirection(SOUTH));
        turtleGraphics.turnRight();
        assertEquals(EAST, turtleGraphics.getCurrentDirection(EAST));
    }
}
