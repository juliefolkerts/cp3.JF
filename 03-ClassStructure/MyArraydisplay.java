public class MyArraydisplay {
    public static void main(String[] args) {
        int[] now = {1,2,3,4,5};
        int[] now2 = {1,2};
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
        // e
        String e = MyArray.different(now, now2);
        System.out.println("Numbers from Array 1 that are not in 2: "+e);
        //f
        Boolean f = MyArray.exist(2, now);
        System.out.println("Is 2 in Array 1: "+f);
        //g
    }
    
}
