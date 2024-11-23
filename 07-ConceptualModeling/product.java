public class product {
    private String name;
    private int price;
    private String shipping_time;

    public product(String name, int price, String shipping_time){
        this.name = name;
        this.price = price;
        this.shipping_time = shipping_time;
    }

    public void displayDetails(){
        System.out.println("Product");
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Shipping time: "+this.shipping_time);
    }
}
