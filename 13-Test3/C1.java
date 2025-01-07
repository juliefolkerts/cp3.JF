//13-Test3;

public class C1 {
    private String name;
    private String surname;
    public C1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String answer(C1 person){
        Char f = person.name.charAt(0);
        Char s = person.surname.charAt(0);
        Char F = f.toUpperCase();
        Char S = s.toUpperCase();
        return  F+S;
    }
    
}
