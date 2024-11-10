//04-DataEncapsulation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
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
        return this.name+","+this.age;
    }


}
