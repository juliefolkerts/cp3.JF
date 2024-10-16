public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        s.name = "John";
        s.age =23;
        System.out.println("Name: "+s.name);
        System.out.println("Age: "+s.age);

        s.sayHello();
        s.displayName();
        s.displayAge();



    }
}
