public class MyArraydisplay {
    public static void main(String[] args) {
        int[] now = {1,2,3};
        int[] now2 = {1,2,3};
        //MyArray calc = new MyArray();
        //a
        int a = MyArray.even(now);
        System.out.println("Array: ");
        System.out.println("Amount of even numbers: "+a);
        //b
        int b = MyArray.positiveOdd(now);
        System.out.println("Amount of positive odd numbers: "+b);
        //c
        String c = MyArray.reverse(now);
        System.out.println("Reverse Array: "+c);
        //d
        boolean d = MyArray.compare(now, now2);
        System.out.println("Array 1 and Array 2 are the same: "+d);
        // not completely working, if array 2 is shorter then array 1
    }
    
}
