public class Person {
    String name;
    double weight_kg;
    int height_cm;

    public Person(String Name){
        name = Name;
        weight_kg = 0;
        height_cm = 0; 
    }

    public Person(String Name, double Weight_kg, int Height_cm){
        name = Name;
        weight_kg = Weight_kg;
        height_cm = Height_cm;
    }
    public void setWeightAndHeight(double newWeight, int newHeight){
        weight_kg = newWeight;
        height_cm = newHeight;
    }
    public double calcBMI(){
        double height_m = (double) (height_cm / 100.0);
        return (weight_kg / (height_m*height_m));
    }

    public void displayInfo(){
        // Person p = new Person("Alvise");
        // p.setWeightAndHeight(100, 160);
        double bmi = calcBMI();
        
        // System.out.println("Name: "+p.name+"\n"+"Weight in kg: "+p.weight_kg+"\n"+"Height in cm: "+p.height_cm+"\n"+"BMI: "+bmi);
        System.out.printf("Name: %s\nWeight in kg: %.2f\nHeight in cm: %d\nBMI: %.2f\n", name, weight_kg, height_cm, bmi);
        if (bmi < 18.5){
            System.out.println("BMI to low");
        } else if (bmi > 24.9){
            System.out.println("Spekkie");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Person p1 = new Person("Alvise");
        p1.setWeightAndHeight(100, 160);
        Person p2 = new Person("Nicco");
        p2.setWeightAndHeight(98, 170);
        Person p3 = new Person("Nacho");
        p3.setWeightAndHeight(69, 12);
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }

}
