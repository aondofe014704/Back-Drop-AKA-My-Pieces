package ClassWork;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;

    public boolean powerOn() {
        this.isOn = true;
        return true;
    }

    public boolean powerOff() {
        this.isOn = false;
        return false;
    }

    public void increaseTemperature() {
        if(temperature >= 16 && temperature < 30){

            this.temperature ++;
        }

    }
    public void decreaseTemperature() {
        if(temperature >= 17 && temperature < 31){

            this.temperature --;
        }
    }

    public int checkTemperature() {
        return temperature;
    }

}
