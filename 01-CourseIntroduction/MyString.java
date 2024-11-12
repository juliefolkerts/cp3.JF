
//import java.lang.classfile.Signature;

//01-CourseIntroduction;

public class MyString {
    private String s;

    public void setS(String s) {
        this.s = s;
    }
    public void numChar(){
        System.out.println(this.s.length());
    }
    public void sub(){
        System.out.println(this.s.substring(0, 8));
    }
    public void ends(){
        System.out.println(this.s.endsWith("day!"));
    }
    public void notempty(){
        System.out.println(!this.s.isEmpty());
    }
    public void laste(){
        System.out.println(this.s.lastIndexOf('e'));
    }
    public void lowerc(){
        System.out.println(this.s.toLowerCase());
    }
    public void upperc(){
        System.out.println(this.s.toUpperCase());
    }
    public void min() {
        System.out.println(this.s.replace(' ', '-'));
    }

    public static void main(String[] args) {
        MyString s = new MyString();
        s.setS("Have a nice day!");
        s.numChar();
        s.sub();
        s.ends();
        s.notempty();
        s.upperc();
        s.lowerc();
        s.laste();
        s.min();
    }
}
