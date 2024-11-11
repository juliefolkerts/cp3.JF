//04-DataEncapsulation;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(3,0);
        System.out.println("Point is on x axis: "+p.isX());
        System.out.println("Point is on y axis: "+p.isY());
        System.out.println(p.toString());
    }
}
