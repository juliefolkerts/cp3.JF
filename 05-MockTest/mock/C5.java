public class C5 {
    public int x;
    public int y;

    public C5(int x, int y){
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

    public static void main(String[] args) {
        C5 o = new C5(3,0);
        System.out.println(o.isX());
        System.out.println(o.isY());
        System.out.println(o.toString());
    }
}
