public class statsdisplay {
    public static void main(String[] args) {
        //stats calculator = new stats();
        int[] numbers = {5,6,7,8,9,10};
        int Range = stats.ItemsInRange(5,10);
        int Sum = stats.SumItems(numbers, 5, 10);
        float Mean = stats.ArithmeticMean(numbers, 5, 10);


        System.out.println("From 5 to 10:");
        System.out.println("Amount of numbers in range: "+Range);
        System.out.println("Sum of numbers in range: "+Sum);
        System.out.println("The arithmetic mean of this range: "+Mean);
    }
}
