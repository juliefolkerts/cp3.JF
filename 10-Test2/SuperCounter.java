//package 10-Test2;

public class SuperCounter extends Counter {
    //Counter counter;

    public SuperCounter(int c) {
        super(c);
    }

    public void addN(int n){
        for (int i = 0;i<n;i++){
            add1();
        }
    }

    
    
}
