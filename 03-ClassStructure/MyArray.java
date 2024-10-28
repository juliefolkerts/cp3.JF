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
        boolean answer = true;
        if (length1 != length2){
            answer = false;
        }
        for (int i=0;i<length1;i++){
            if(array1[i] != array2[i]){
                answer = false;
            }
        }
        if (length1 != length2){
            answer = false;
        }
        return answer;
    }
        
    } 


