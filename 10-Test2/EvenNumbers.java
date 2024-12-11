//package 10-Test2;

public class EvenNumbers {
    private int[] arr;

    public EvenNumbers(int[] arr) {
        this.arr = arr;
    }
    public int count(){
        int count = 0;
        for (int number : arr){
            if (number%2 == 0){
                count++;
            }
        }
        return count;
    }

    public EvenNumbers filterEven(){
        int count = 0;
        for (int number : arr){
            if (number%2 == 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        int i = 0;
        for (int number : arr){
            if (number%2 == 0){
                newArr[i] = number;
                i++;
            }
        }
        return new EvenNumbers(newArr);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        EvenNumbers test = new EvenNumbers(arr1);
        System.out.println(test.filterEven().count());
    }
}
