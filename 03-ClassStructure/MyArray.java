public class MyArray {
    //a
    public static int even(int[] array){
        int count = 0;
        for (int number : array){
            if (number % 2 == 0 ){
                count += 1;
            }
        }
        return count;
    }
    //b
    public static int positiveOdd(int[] array){
        int count = 0;
        for (int number : array){
            if(number > 0 && number % 2 != 0){
                count += 1;
            }
        }
        return count;
    }
    //c
    public static String reverse(int[] array){
        if (array == null){
            return "0";
        }
        StringBuilder answer = new StringBuilder();
        int length = array.length;
        // int[] revArray = new int[length]; // gives size of new array by "length"
        for (int i=0 ; i<(length-1); i+=1){
            answer.append(array[(length-i-1)]).append(",");
        }
        answer.append(array[0]);
        return answer.toString();
        }
    //d
    public static boolean compare(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        if (length1 != length2){
            return false;
        }
        for (int i=0;i<length1;i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
    
        return true;
    }
    //e
    public static String different(int[] array1, int[] array2){
        StringBuilder dif_nums = new StringBuilder();
        for (int number : array1){
            boolean gevonden = false;
            for (int i=0; i < array2.length;i++){
                if (number == array2[i]){
                    gevonden = true;
                    break;
                }
            }
            if (!gevonden) {
                dif_nums.append(number).append(","); // make sure no , at the end tho****
            }
        }
        return dif_nums.toString();
    }
    //f
    public static boolean exist(int number, int[] array){
        boolean answer = false;
        for (int i=0; i<array.length;i++){
            if (array[i]==number){
                answer = true;
                break;
            }
        }
        return answer;
    }
    //g
    public static int secondMax(int[] array){
        int max = 0;
        int length = array.length;
        for (int i =0; i < length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        int max2 = 0;
        for (int j =0; j < length;j++){
            if (array[j]>max2 && array[j]<max){
                max2 = array[j];
            }
        }
        return max2;
    }
    //h
    public static int lastColumn(int[][] array){
        int sum = 0;
        for (int r=0; r<array.length; r++){
            int lastcol = array[r].length;
            sum += array[r][lastcol];
        }
        return sum;
    }
        
    } 


