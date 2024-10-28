public class MyArraydisplay {
    public static void main(String[] args) {
        int[] now = {1,2,3};
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
    }
    
}
