
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


    public static void main(String[] args) {
        int[] array1 = {1,-3,3,4,5,-9};
        int[] array2 = {1,2,4,4,-5};
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
    }
}
