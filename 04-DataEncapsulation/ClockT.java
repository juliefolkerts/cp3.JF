//04-DataEncapsulation;

public class ClockT {
    public static void main(String[] args) {
        Clock c = new Clock(22,3);
        System.out.println(c.toString());
        c.setHour(29);
        c.setMinute(89);
        System.out.println(c.toString());
        c.addMinute();
        System.out.println(c.toString());
    }

}
