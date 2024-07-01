package ChapterThree;

public class ClockClass {
    private int hour;
    private int minute;
    private int second;
    public ClockClass(int hour, int minute, int second){
        if(hour > 0 || hour < 24)this.hour = hour;
        if(minute >= 0|| minute <60)this.minute = minute;
        if(second >= 0 || second < 60) this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public String displayTime() {
        if(hour > 0 && hour < 23) {

         }
        if(minute > 0 && minute < 59) {

        }
        if(second > 0 && second < 59) {

        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
