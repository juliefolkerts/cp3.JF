//01-CourseIntroduction;

public class Clock {
    public int hour;
    public int minute;

    public Clock(){
        this.hour = 0;
        this.minute = 0;
    }
    public Clock(int hour, int minute){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }
    public void setClock(int hour, int minute){
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
    }
    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    public void displayTime(){
        if (this.hour < 10){
            if (this.minute < 10){
                System.out.printf("0%d:0%d%n", this.hour,this.minute);
            } else {
                System.out.printf("0%d:%d%n", this.hour,this.minute);
            }
        } else {
            if (this.minute < 10){
                System.out.printf("%d:0%d%n", this.hour,this.minute);
            } else {
                System.out.printf("%d:%d%n", this.hour,this.minute);
            }
        }
    }
    public void addOneMinute(){
        if (this.minute!=59){
            this.minute++;
        } else {
            if (this.hour !=23){
                this.hour ++;
                this.minute = 0;
            } else {
                this.hour =0;
                this.minute=0;
            }
        }
    }
    public static void main(String[] args) {
        Clock c = new Clock(12,47);
        c.displayTime();
        c.setClock(18,14);
        c.displayTime();
        c.setClock(9,3);
        c.displayTime();
        c.setClock(23,58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }

}
