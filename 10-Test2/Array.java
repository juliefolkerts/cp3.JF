

public class Array {
    public static boolean arr(int[] arr1, int[] arr2){
        int count1 = 0;
        int count2 = 0;
        boolean answer = false;
        for (int number : arr1){
            if (number > 9 && number<100){
                count1 += 1;
            }
        }
        for (int number : arr2){
            if (number > 9 && number<100){
                count2+=1;
            }
        }
        if (count1 == count2){
            answer = true;
        }
        return answer;
    }
}
