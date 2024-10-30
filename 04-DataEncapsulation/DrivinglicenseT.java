public class DrivinglicenseT {
    
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setName("Jack");
        dl.setSurname("Jonker");
        dl.setLicense_num("123456");
        dl.setName("Jake"); // changing name

        System.out.println("Driver's name: "+dl.getName());
        System.out.println("Driver's surname: "+dl.getSurname());
        // ...
    }
}

