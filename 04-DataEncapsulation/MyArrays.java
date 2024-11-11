//04-DataEncapsulation

public class MyArrays { 
    static int odd(int[] array){
        int count = 0;
        for (int i=0;i < array.length;i++){
            if ((array[i] % 2) != 0 && array[i]>=0){
                count += 1;
            }
        }
        return count;
        
    }
    static int above(int[] array){
        int sum = 0;
        int total = 0;
        for (int i=0;i < array.length;i++){
            total += array[i];
        }
        float mean = (float) total / array.length;
        for (int i=0;i < array.length;i++){
            if (array[i]>mean){
                sum+=array[i];
            }
        }
        return sum;
    }
}
