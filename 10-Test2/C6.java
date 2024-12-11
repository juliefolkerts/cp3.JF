//package 10-Test2;

import java.util.ArrayList;

public class C6 {
    private ArrayList<Persoon> family;

    public C6(<any> family) {
        this.family = new ArrayList<>();
    }
    public void m1(Persoon p){
        family.add(p);
    }
    public int m2(){
        int count = 0;
        for (Person p : family){
            if (p.getAge()>=18){
                count ++;
            }
        }
        return count;
    }

}
