package NewPackageForNewAccount;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public void setHour(int hour) {
        if(hour < 0 || hour >= 23) throw new IllegalArgumentException("Invalid hour: " + hour);
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60) throw new IllegalArgumentException("Invalid minute: " + minute);
        this.minute = minute;
    }
    public void setSecond(int second) {
        if(second < 0 || second >= 60) throw new IllegalArgumentException("Invalid second: " + second);
        this.second = second;
    }

}
