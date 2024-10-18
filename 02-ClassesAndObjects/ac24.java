public class ac24 {
    public static void main(String[] args) {
        double buy_rate = 4.5940;
        double sell_rate = 4.6250;
        double spread = Math.abs(buy_rate - sell_rate);
        System.out.println("Buy rate: "+buy_rate);
        System.out.println("Sell rate: "+sell_rate);
        System.out.printf("Spread: %.4f", spread);
    }
}
