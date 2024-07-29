package TurtleGraphics;

public class TurtleGraphics {
    private boolean penIsUp;
    private Direction currentDirection;
    public boolean penIsUp(){
       return this.penIsUp = true;
    }

    public boolean penIsDown() {
        return this.penIsUp = true;
    }

    public void turnRight() {
        if(this.currentDirection == Direction.EAST) this.currentDirection = Direction.SOUTH;
        if(this.currentDirection == Direction.SOUTH) this.currentDirection = Direction.WEST;
        if(this.currentDirection == Direction.WEST) this.currentDirection = Direction.NORTH;
    }

    public Direction getCurrentDirection(Direction currentDirection) {
        return this.currentDirection;
    }

}
