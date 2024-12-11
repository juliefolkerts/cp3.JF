//package 06-Test1;

public class Family {
    private Person[] arr;

    public Family(Person[] arr) {
        this.arr = arr;
    }
    public int adults(){
        int count = 0;
        for (Person p : arr){
            if (p.getAge()>=18){
                count++;
            }
        }
        return count;
    }
}
