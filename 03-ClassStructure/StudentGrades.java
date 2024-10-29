import java.util.Arrays;

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
        
        // Display the student's record
        student.displaystudent("John Doe");
    }

}

