//13-Test3;

public class C1 {
    private String name;
    private String surname;
    public C1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String answer(C1 person){
        char f = person.name.charAt(0);
        char s = person.surname.charAt(0);
        char F = Character.toUpperCase(f);
        char S = Character.toUpperCase(s);
        return  ""+F+S;
    }
    public static void main(String[] args) {
        C1 person1 = new C1("john", "doe");
        C1 person2 = new C1("Jane", "smith");

        System.out.println(person1.answer(person2));
    }
}
