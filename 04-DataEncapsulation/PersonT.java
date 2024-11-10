//04-DataEncapsulation;

public class PersonT {
    public static void main(String[] args) {
        Person p = new Person("ANNA",17);

        System.out.println(p.getName());    
        System.out.println(p.getAge());

        System.out.println(p.isAdult());
        System.out.println(p.toString());
    }
}
