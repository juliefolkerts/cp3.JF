public class o2o25{
    public int hours;
    public int minutes;
    public o2o25(int hours,int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public void displayTime(){
        System.out.printf("%d:%d", this.hours, this.minutes);
    }
    public void minutesFromMidnight(){
        int countMin = this.hours*60 + this.minutes;
        int countSec = countMin * 60;
        System.out.printf("minutes from midnight: %d",countMin);
        System.out.printf("seconds from midnight: %d",countSec);

    }
    public static void main(String[] args) {
        o2o25 time = new o2o25(14,27);
        time.displayTime();
        time.minutesFromMidnight();
    }

}