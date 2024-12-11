//package 10-Test2;

public class C2 {
    public static boolean m(int[] numbers){
        int positivesum = 0;
        int negaivesum = 0;
        for (int num : numbers){
            if (num >= 0){
                positivesum+=num;
            }
            else {
                negaivesum += num;
            }
        }
        if (positivesum > Math.abs(negaivesum)){
            return true;
        }
        return false;
    }
}
