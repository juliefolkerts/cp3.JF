//package 10-Test2;

public class C1 {


    public static int m1(int[] array1, int[] array2){
        int count = 0;
        for (int num1 : array1){
            boolean found = false;
            for (int num2 : array2){
                if (num1 == num2){
                    found = true;
                    break;
                }
            }
            if (!found){
                count ++;
            }
        }
        return count;
    }
    public static int m2(int[] array){
        int largest = 0;
        int seclargest = 0;
        for (int num: array){
            if (num>largest){
                seclargest =largest;
                largest = num;

            }
        }
        return seclargest;
        
    }
}
