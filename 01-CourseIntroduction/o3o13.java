
import java.util.ArrayList;
import java.util.Arrays;

//01-CourseIntroduction;

public class o3o13 {
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {-2,-4,6,1,10};
    public static int even(int[] array){
        int count = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i]%2 == 0 ){
                count ++;
            }
        }
        return count;
    }
    public static int positiveOdd(int[] array){
        int count = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i]%2 != 0 && array[i]>= 0){
                count ++;
            }
        }
        return count;
    }
    public static int[] reverse(int[] array){
        int[] revarray = new int[array.length];
        for (int i = 0;i<array.length;i++){
            revarray[i] = array[array.length - 1 - i];
        }
        return revarray;
    }   
    public static boolean compare(int[] array1,int[] array2){
        boolean answer = true;
        if (array1.length == array2.length){
            for (int i = 0;i<array1.length;i++){
                if (array1[i]!=array2[i]){
                    answer = false;
                    break;
                }
                //break;
            }
        } else {
            answer = false;
        }
        return answer;
    }
    public static ArrayList<Integer> different(int[] array1, int[] array2){
        ArrayList<Integer> diff = new ArrayList<>();
        ArrayList<Integer> array2List = new ArrayList<>();
        for (int num : array2){
            array2List.add(num);
        }
        for (int num : array1){
            if (!array2List.contains(num)){
                diff.add(num);
            }
        }
        return diff;
    }
    public static boolean exist(int number, int[] array){
        boolean answer = false;
        for (int num : array){
            if (num == number){
                answer = true;
                break;
            }
        }
        return answer;
    }
    public static int secondMax(int[] array){
        int secmax = 0;
        int max = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        for (int i=0;i<array.length;i++){
            if (array[i]>secmax && array[i]<max){
                secmax = array[i];
            }
        }
        return secmax;
    }
    public static int lastColumn(int[][] array){
        int sum = 0;
        int last = array[0].length-1;
        for (int[] row : array){
            sum += row[last];
        }
        return sum;
        //int last = array[0].length-1;
        //for (int num : array[last]){
            //sum += array[last][num];
        //
    } 
    public static int[][] swap(int[][] array){
        int rows = array.length;
        int columns = array[0].length;
        int last = array[0].length-1;
        int[][] matrix = new int[rows][columns];
        for (int r = 0;r<matrix.length;r++){
            for (int i = 0;i < matrix[r].length;i++){
                if (i==0){
                    matrix[r][i] = array[r][last];
                } else if (i==last){
                    matrix[r][i] = array[r][0];
                } else {
                    matrix[r][i] =array[r][i];
                }
            }
        }
        return matrix;
    }
    public static int[] two2one(int[][] array){
        int lengtharr = array[0].length * array.length;
        int[] oneD = new int[lengtharr];
        //int[] oneD = new int[lengtharr];
        int i = 0;
        for (int[] row : array){
            for (int num : row){
                oneD[i]=num;
                i ++; 
            }
        }
        return oneD;
    }


    public static void main(String[] args) {
        int[] array1 = {1,-3,3,4,5,-9};
        int[] array2 = {1,2,4,4,-5};
        int[][] matrix = {{1,1,2},{1,1,3},{1,1,4}};
        //o3o13 o = new o3o13();
        System.out.println(o3o13.even(array1));
        System.out.println(o3o13.even(array2));
        System.out.println(o3o13.positiveOdd(array1));
        System.err.println(o3o13.positiveOdd(array2));
        System.out.println(Arrays.toString(o3o13.reverse(array2)));
        System.out.println(o3o13.compare(array1, array2));
        System.out.println(o3o13.different(array1, array2));
        System.out.println(o3o13.exist(2, array2));
        System.out.println(o3o13.exist(20, array2));
        System.out.println(o3o13.secondMax(array2));
        System.out.println(o3o13.lastColumn(matrix));
        System.out.println(Arrays.deepToString(o3o13.swap(matrix)));
        System.out.println(Arrays.toString(o3o13.two2one(matrix)));
    }
}
