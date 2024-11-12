//01-CourseIntroduction;

public class MyArray {
    static int odd(int[] array){
        int sum = 0;
        for (int num : array){
            if (num >= 0 && num%2!=0){
                sum++;
            }
        }
        return sum;
    }
    static int above(int[] array){
        int sum = 0;
        int total = 0;
        for (int num : array){
            total += num;
        }
        float mean = total/array.length;
        for (int num : array){
            if (num>mean){
                sum+=num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(MyArray.odd(arr2));
        System.out.println(MyArray.above(arr1));
    }
}
