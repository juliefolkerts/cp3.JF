public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();

        dl.setName("Ada");
        dl.setSurname("Krzyczanowska");
        dl.setAddress("Florianskiego");
        dl.setPostalCode("30-066");
        dl.setCity("Lodz");
        dl.setLicenseNumber("AB123456");
        dl.setYearOfIssue(2025);
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

