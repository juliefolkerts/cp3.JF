//package 12-Interfaces;

public class TV implements CanOnOff, CanChangeChanel, CanChangeVolume {
    public boolean state;
    public int channelNo;
    public int volume;
    public void On(){
        this.state = true;
        this.channelNo = 1;
        this.volume = 1;
    }
    public void Off(){
        this.state = false;
    }
    public void setChanel(int nr){
        if (state && nr > 0 && nr < 100){
            this.channelNo = nr;
        }
    }
    public void ChanelDown(){
        if (state && this.channelNo > 1){
            this.channelNo--;
        }
    }
    public void ChanelUp(){
        if (state && this.channelNo < 99){
            this.channelNo++;
        }
    }
    public void volumeDown(){
        if (state && this.volume > 1){
            this.volume--;
        }
    }
    public void volumeUp(){
        if (state && this.volume < 10){
            this.volume++;
        }
    }
    public void Display_state(){
        System.out.println("TV is "+this.state);
        if(state){
            System.out.println("Channel: "+this.channelNo);
            System.err.println("Volume: "+this.volume);
        }
    }
}
