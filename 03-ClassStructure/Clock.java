public class Clock {
    int hour;
    int minute;

    public Clock(){
        this.hour = 0;
        this.minute = 0;
    }

    public Clock(int hour, int minute){
       if (hour <= 23 && hour > 0 && minute <= 59 && minute > 0) {
        this.hour = hour;
        this.minute = minute;
       }
    }
    public void setClock(int hour, int minute){
        if (hour <= 23 && hour > 0 && minute <= 59 && minute > 0) {
            this.hour = hour;
            this.minute = minute;
           }
    }

    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }

    public void displaytime(){
        if (this.hour >= 10 ){
            if (this.minute >= 10){
                System.out.println("Time: "+this.hour+":"+this.minute);
            }
            else {
                System.out.println("Time: "+this.hour+":0"+this.minute);
            }
        }
        else {
            if (this.minute >= 10){
                System.out.println("Time: 0"+this.hour+":"+this.minute);
            }
            else {
                System.out.println("Time: 0"+this.hour+":0"+this.minute);
            }
        }
        }
    public void addOneMinute(){
        this.minute += 1;
    }

    }

