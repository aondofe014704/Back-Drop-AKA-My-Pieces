package Assignments;

public class Television {
    private int channel = 1;
    private int volume = 0;
    private boolean isOn;

    public boolean powerOff() {
        this.isOn = true;
        return true;
    }

    public boolean powerOn() {
        this.isOn = true;
        return true;
    }

    public void increaseVolume() {
        if(volume >= 0 && volume < 100) {
            this.volume += 1;
        }
    }

    public int checkVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(volume >= 0 && volume <= 100) {
            this.volume -= 1;
        }
    }

    public void changeChannel() {
        if(channel > 0) {
            this.channel += 1;
        }

    }

    public int checkChannel() {
        return channel;
    }
}
