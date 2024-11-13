public class C1 {
    private String name;
    private int age;

    public C1(String name,int age){
        this.name =name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult(){
        boolean answer = false;
        if(this.age >= 18){
            answer = true;
        }
        return answer;
    }
    @Override
    public String toString(){
        return this.name+", "+this.age;
    }

    public static void main(String[] args) {
        C1 o = new C1("Anna", 21);
        o.getAge();
        o.isAdult();
        o.setAge(17);
        o.isAdult();
        o.toString();
    }
}
