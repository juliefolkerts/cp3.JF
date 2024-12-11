//package 10-Test2;
import java.util.Arrays;

public class C4 {
    private int[] ratings;

    public C4(int[] ratings) {
        this.ratings = ratings;
    }
    public int m(){
        Arrays.sort(ratings);
        int sum = 0;
        for (int i=1;i<ratings.length-1;i++){
            sum+=ratings[i];
        }
        return sum;
    }
}
