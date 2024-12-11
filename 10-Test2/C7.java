//package 10-Test2;
import java.util.Arrays;

public class C7 extends Vehiclee {
    private int speed;

    public C7(int speed, int seats) {
        super(seats);
        this.speed = speed;
    }
    public int[] spec(){
        int[] answer = new int[2];
        answer[0] = getSeats();
        answer[1] = this.speed;
        return answer;
    }
    public static void main(String[] args) {
        Vehiclee v = new Vehiclee(5);
        C7 c = new C7(4, 6);
        System.out.println(Arrays.toString(c.spec()));
    }
}
