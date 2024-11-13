public class C2 {
    int counter;

    public C2(){
        this.counter = 0;
    }
    public void increase(){
        this.counter ++;
    }
    public void decrease(){
        this.counter --;
    }
    public void increase(int n){
        this.counter += n;
    }
    public void decrease(int n){
        this.counter -= n;
    }
    public void value(){
        System.out.println( this.counter);
    }

    public static void main(String[] args) {
        C2 o =new C2();
        o.value();
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        o.value();
    }
}
