public class customer {
    private String name;
    private String address;
    private String country;

    public customer(String name, String address, String country){
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public void displayDetails(){
        System.out.println("Customer");
        System.out.println("Name: "+this.name);
        System.out.println("Address: "+this.address);
        System.out.println("Origin: "+this.country);
    }
}