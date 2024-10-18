public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        s.name = "John";
        s.age =23;
        // System.out.println("Name: "+s.name);
        // System.out.println("Age: "+s.age);

        s.sayHello();   
        s.displayName();    
        s.displayAge();   

        Student s2 = new Student();
        s2.name = "Jane";
        s2.age =26;
        s2.studentid = "232966";
        s2.validid = true;
        s2.semester = 5;
        s2.average_grade = 3.8;

        s2.sayHello();      
        s2.displayName();    
        s2.displayAge();
        s2.displayInfo();


    }
}
