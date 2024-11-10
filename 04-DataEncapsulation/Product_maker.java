class Product_maker{
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Pomidor");
        product.setVege(true);

        System.out.println("Product name: "+product.getName());
        System.out.println("Product is vegetarian: "+product.isVege());
    }
}
