public class MyArraydisplay {
    public static void main(String[] args) {
        int[] now = {1,2,3,4,5};
        int[] now2 = {1,2};
        int[][] matrix = {{1,2,3},{4,5,6}};
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
        int g = MyArray.secondMax(now);
        System.out.println("Second larges number in Array 1: "+g);
        //h
        int h = MyArray.lastColumn(matrix);
        System.out.println("Sum of last column of matrix: "+h);
        //i
        System.out.println("Last 2 columns swapped: ");
        int[][] matrx = MyArray.swap(matrix);
        for (int[] row : matrx) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
        //j
        String j = MyArray.two2one(matrix);
        System.out.println("From 2D to 1D: "+j);
    }
    
}
