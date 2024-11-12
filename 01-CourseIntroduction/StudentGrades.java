
import java.util.Arrays;

//01-CourseIntroduction;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades (String name, double[] grades){
        this.studentName = name;
        this.grades = grades;
    }
    public double lowest(){
        double low = 5.0;
        for (double grade : this.grades){
            if (grade<low){
                low = grade;
            }
        }
        return low;
    }
    public double highest(){
        double high = 0.0;
        for (double grade : this.grades){
            if (grade>high){
                high = grade;
            }
        }
        return high;
    }
    public int numberOfGrades(){
        return this.grades.length;
    }
    public double gpa(){
        double total = 0.0;
        for (double grade : this.grades){
            total += grade;
        }
        return total/numberOfGrades();
    }
    public void display(){
        System.out.println("Name: "+this.studentName);
        System.out.println("grades: "+Arrays.toString(this.grades));
        System.out.println("amount of grades: "+numberOfGrades());
        System.out.println(lowest());
        System.out.println(highest());
        System.out.println(gpa());
    }

    public static void main(String[] args) {
        double[] agrades = {3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        StudentGrades s = new StudentGrades("Amanda", agrades);
        s.display();
        double[] jgrades = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s2 = new StudentGrades("James", jgrades);
        s2.display();
        
    }
}
