public class ac25 {
    public static void main(String[] args) {
        int hours = 20;
        int minutes = 19;

        int min_from_midnight = (hours*60) + minutes;
        int sec_from_midnight = min_from_midnight*60;

        System.out.println("Hours= "+hours);
        System.out.println("Minutes= "+minutes);
        System.out.println("Time --> "+hours+":"+minutes);
        System.out.println("Minutes from midnight: "+min_from_midnight);
        System.out.println("Seconds from midnight: "+sec_from_midnight);

        
    }
}
