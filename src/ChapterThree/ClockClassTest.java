package ChapterThree;

public class ClockClassTest {
    public static void main(String[] args) {
        ClockClass clockClass = new ClockClass(11, 38, 4);

        System.out.println(clockClass.displayTime());

        System.out.println("clockClass.getHour() = " + clockClass.getHour());
        System.out.println("clockClass.getMinute() = " + clockClass.getMinute());
        System.out.println("clockClass.getSecond() = " + clockClass.getSecond());

    }
}
