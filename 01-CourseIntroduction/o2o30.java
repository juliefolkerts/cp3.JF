//01-CourseIntroduction;

public class o2o30 {
    public int counter;
    public o2o30(){
        this.counter = 0;
    }

    public int increase(){
        this.counter += 1;
        return this.counter;
    }
    public int decrease(){
        this.counter -= 1;
        return this.counter;
    }
    public int increase10(){
        this.counter += 10;
        return this.counter;
    }
    public int decrease10(){
        this.counter -= 10;
        return this.counter;
    }
    public int reset(){
        this.counter = 0;
        return this.counter;
    }
    public void display(){
        System.out.println(this.counter);
    }
    public static void main(String[] args) {
        o2o30 c1 = new o2o30();
        c1.increase10();
        c1.increase10();
        c1.increase();
        c1.increase();
        c1.increase();
        c1.display();
        o2o30 c2 = new o2o30();
        c2.decrease10();
        c2.decrease10();
        c2.decrease10();
        c2.decrease10();
        c2.decrease10();
        c2.increase();
        c2.increase();
        c2.increase();
        c2.display();

    }
}
