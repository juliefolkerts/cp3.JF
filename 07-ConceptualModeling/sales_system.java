public class sales_system {
    public static void main(String[] args) {
        seller seller = new seller("Loetsiaantje", "Zwolle", "The Netherlands");
        customer customer = new customer("Nacho", "Tharagotha", "Espain");
        product product = new product("Taco's", 9, "+/- 9 business days");

        customer.displayDetails();
        product.displayDetails();
        seller.displayDetails();
    }
}
