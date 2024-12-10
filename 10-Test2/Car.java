//package 10-Test2;

public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int maxSpeed, int s) {
        super(s);
        this.maxSpeed = maxSpeed;
    }
    public int[] spec(){
        int[] answer = new int[2];
        answer[0] = getSeats();
        answer[1] = this.maxSpeed;
        return answer;
    }

}
