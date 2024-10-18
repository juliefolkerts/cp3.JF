public class Student {
    String name;  
    int age; 
    String studentid;
    boolean validid;
    int semester;
    double average_grade;

    
    void sayHello() {
    System.out.println("Hello from " + name);
    }

    void displayName() {
    System.out.println("Name: " + name);
    }

    void displayAge() {
    System.out.println("Age: " + age);
    }

    void displayInfo() {
        System.out.println("ID number: "+ studentid+ "\n" + "ID validity: "+ (validid ? "valid" : "invalid") + "\n" +"Semester: "+semester+"\n"+"Average grade: "+average_grade);
    }
}