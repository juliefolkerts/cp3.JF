public class ac26t {
    public static void main(String[] args) {
        ac26 phone = new ac26();

        phone.number = "621265851";
        phone.landcode = "+31";
        phone.brand = "Apple";
        phone.years_old = 1;
        phone.storage = 128.5;

        phone.receiveCall(phone.number, phone.landcode);
        phone.receiveMessage(phone.number, phone.landcode);
        phone.displayInfo(phone.brand, phone.years_old, phone.storage);
    }
}
