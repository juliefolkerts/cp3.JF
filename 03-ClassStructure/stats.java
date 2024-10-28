public class stats {
    public static int ItemsInRange(int x, int y){
        int items = (Math.abs((int)(y - x)))+1;
        return items;
    }
    public static int SumItems(int[] numbers,int x, int y){
        int sum = 0;
        for (int number : numbers){
            if (number <= y && number >= x){
                sum += number;
            }
        }
        return sum;
    }
    public static float ArithmeticMean(int []numbers, int x, int y){
        //float mean = SumItems(numbers, x, y) / ItemsInRange(x, y);
        int Sum = SumItems(numbers, x, y);
        int Amount = ItemsInRange(x, y);
        return (float) Sum / Amount;
    }
}
