//package 12-Interfaces;

public class TV implements CanOnOff {
    public boolean state;
    public void On(){
        this.state = true;
    }
    public void Off(){
        this.state = false;
    }
    public void Display_state(){
        System.out.println("TV is "+this.state);
    }
}
