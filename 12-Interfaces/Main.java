//package 12-Interfaces;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.On();
        tv.Display_state();
        tv.Off();
        tv.Display_state();
        tv.setChanel(5);
        tv.volumeUp();
        tv.Display_state();
        tv.On();
        tv.ChanelUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.Display_state();
        tv.ChanelDown();
        tv.ChanelDown();
        tv.volumeDown();
        tv.Display_state();
    }
}
