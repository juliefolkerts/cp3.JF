//04-DataEncapsulation;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        boolean answer = false;
        if (this.y == 0){
            answer = true;
        }
        return answer;
    }

    public boolean isY(){
        boolean answer = false;
        if (this.x == 0){
            answer = true;
        }
        return answer;
    }
    @Override
    public String toString(){
        return "P("+this.x+","+this.y+")";
    }
}
