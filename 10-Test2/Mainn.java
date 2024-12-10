import java.util.Arrays;
public class Mainn {
    public static void main(String[] args) {
        Numbers nums = new Numbers(9,7,4,3,7);
        System.out.println(nums.different());

        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,48,4,6,97,57};
        Array array = new Array();

        System.out.println(array.arr(arr1, arr2));

        Vehicle v = new Vehicle(3);
        Car c = new Car(2, 5);
        System.out.println(Arrays.toString(c.spec()));
    }
}
