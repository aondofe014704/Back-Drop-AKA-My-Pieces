package Assignments;

import com.sun.jdi.request.BreakpointRequest;

public class AutomaticBike {
    private boolean isOn;

    private int speed = 0;
    private int gear = 1;

    public boolean powerOff() {
        this.isOn = false;
        return true;
    }

    public boolean powerOn() {
        this.isOn = true;
        return true;
    }

    public void increaseSpeed() {
        if(speed >= 0 &&  speed <= 20) this.speed++;
        if(speed >= 21 && speed <= 30) this.speed += 2;
        if(speed >= 31 && speed <= 40) this.speed += 3;
        if(speed >= 41 && speed <= 50) this.speed += 4;

    }

    public int checkSpeed() {
        return this.speed;
    }

    public void decreaseSpeed() {
        if(speed > 0 &&  speed <= 20) this.speed--;
        if(speed >= 21 && speed <= 30) this.speed -= 2;
        if(speed >= 31 && speed <= 40) this.speed -= 3;
        if(speed >= 41 && speed <= 50) this.speed -= 4;
    }
}
