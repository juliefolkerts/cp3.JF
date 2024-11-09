public class C5 {
    int x;
    int y;
    public C5(int x, int y){
        this.x =x;
        this.y =y;
    }
    public boolean isX(){
        boolean answer = false;
        if(this.x == 0){
            answer = true;
        }
        return answer;
    }
    public boolean isY(){
        boolean answer = false;
        if(this.y == 0){
            answer = true;
        }
        return answer;
    }
    public String toString(){
        return "P("+this.x+","+this.y+")";
    }


}
