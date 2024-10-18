public class ac22 {
    public static void main(String[] args) {
        int height_cm = 174;
        int feet = (int) (height_cm / 30.48);
        int inch = (int) ((height_cm % 30.48) / 2.54);

        System.out.println("height in cm: "+height_cm+"\n"+"height in feet/inch: "+feet+" feet "+inch+" inch");


    }
}