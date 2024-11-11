//04-DataEncapsulation;

public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute){
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 ){
            this.hour = hour;
            this.minute = minute;
        }
    }
    
    public void addMinute(){
        if (this.minute != 59){
            this.minute ++;
        } else {
            if (this.hour == 23){
                this.hour = 0;
                this.minute = 0;
            } else {
                this.hour ++;
                this.minute = 0;
            }
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <=23){
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString(){
        if (this.hour < 10){
            if (this.minute < 10){
                return "0"+this.hour+":0"+this.minute;
            } else {
                return "0"+this.hour+":"+this.minute;
            }
        } else {
            if (this.minute < 10){
                return this.hour+":0"+this.minute;
            } else {
                return this.hour+":"+this.minute;
            }
        }
    }

}
