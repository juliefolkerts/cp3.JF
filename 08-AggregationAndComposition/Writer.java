public class Writer{
    private int age;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Writer(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        return "Author: "+this.name+"\n"+"age: "+this.age;
    }
}