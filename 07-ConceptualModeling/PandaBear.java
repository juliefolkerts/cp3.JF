public class PandaBear {
    private String name;
    private int age;
    private String color;
    private double weight;

    public PandaBear(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + " the PandaBear is eating bamboo");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void displayDetails() {
        System.out.println("PandaBear Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        PandaBear panda1 = new PandaBear("Alvi", 5, "Black and White", 175.0);
        PandaBear panda2 = new PandaBear("Kika", 3, "White and Black", 160.5);

        System.out.println("PandaBear 1 Details:");
        panda1.displayDetails();
        System.out.println("\nPandaBear 2 Details:");
        panda2.displayDetails();

        System.out.println("\nActions:");
        panda1.eat();
        panda1.sleep();
        panda2.eat();
        panda2.sleep();
    }
}
