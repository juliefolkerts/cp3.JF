public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();

        dl.setName("Jack");
        dl.setSurname("Smith");
        dl.setAddress("123 Main St");
        dl.setPostalCode("12345");
        dl.setCity("Springfield");
        dl.setLicenseNumber("AB123456");
        dl.setYearOfIssue(2020);
        dl.setLicenseCategory("B");

        System.out.println("Driver's Name: " + dl.getName());
        System.out.println("Driver's Surname: " + dl.getSurname());
        System.out.println("Address: " + dl.getAddress());
        System.out.println("Postal Code: " + dl.getPostalCode());
        System.out.println("City: " + dl.getCity());
        System.out.println("License Number: " + dl.getLicenseNumber());
        System.out.println("Year of Issue: " + dl.getYearOfIssue());
        System.out.println("License Category: " + dl.getLicenseCategory());
    }
}

