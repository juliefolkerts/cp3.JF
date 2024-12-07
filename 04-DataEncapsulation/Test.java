//04-DataEncapsulation;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(3,0);
        System.out.println("Point is on x axis: "+p.isX());
        System.out.println("Point is on y axis: "+p.isY());
        System.out.println(p.toString());

        Bookk b = new Bookk();
        b.setPages(3);
        System.out.println(b.toString());
        b.setPages(4);
        System.out.println(b.toString());
        b.setPages(-2);
        System.out.println(b.toString());


        //21
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));

    }
}
