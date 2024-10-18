public class ac26 {
        String number;
        String landcode;
        String brand;
        int years_old;
        double storage;

        void receiveCall(String number, String landcode){
            System.out.println("Call from "+landcode+number);
        }
        void receiveMessage(String number, String landcode){
            System.out.println("Text from "+landcode+number);
        }
        void displayInfo(String brand, int years_old, double storage){
            System.out.println("Brand: "+brand+"\n"+"Purchace year: "+(2024-years_old)+"\n"+"Storage: "+storage);
        }
    }

