import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public double lowestgrade(){
        double lowest = grades[0];
        for (int i=0;i<(grades.length);i++){
            if (grades[i]<lowest){
                lowest = grades[i];
            }
        }
        return lowest;
    }
    public double highestgrade(){
        double highest = grades[0];
        for (int i=0;i<grades.length;i++){
            if (grades[i]>highest){
                highest = grades[i];
            }
        }
        return highest;
    }
    public int amountOfGrades(){
        int amount = grades.length;
        return amount;
    }
    public double gpa(){
        double total = 0.0;
        for (int i=0;i<grades.length;i++){
            total += grades[i];
        }
        double average = total/grades.length;
        return average;
    }

    public StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        Random random = new Random(); // creating instance of random class called "random"
        for (int i=0;i<numberOfGrades;i++){
            // grades[i] = random.nextDouble()*5;
            double randgrade = (2.0+(random.nextDouble()*3));
            grades[i] = (Math.round(randgrade)*10)/10.0; // It's only generating doubles like x.0
        }
    }

    public StudentGrades(String name){
        this.studentName = name;
        Scanner scan = new Scanner(System.in);

        System.out.println("Amount of grades: ");
        int numberOfGrades = scan.nextInt();
        this.grades = new double[numberOfGrades];

        for (int i =0;i < numberOfGrades;i++){
            System.out.println("Enter grade "+(i+1)+" :");
            double grade = scan.nextDouble();
            grades[i]=grade;

        }
        scan.close(); // why??
    }

    public void displaystudent(String name){
        System.out.println("Student name: "+studentName); 
        System.out.println("Grades: "+ Arrays.toString(grades));
        System.out.println("Amount of grades: "+amountOfGrades());
        System.out.println("Lowest grade: "+lowestgrade());
        System.out.println("Highest grade: "+highestgrade());
        System.out.println("Average grade: "+gpa());
    }

    public static void main(String[] args) {
        double[] grades = {88.5, 92.0, 76.5, 85.0, 67.5};
        StudentGrades student = new StudentGrades("John Doe", grades);
        
        student.displaystudent("John Doe");

        StudentGrades student2 = new StudentGrades("Jane Doe");

        student2.displaystudent("Jane Doe");
    }

}

