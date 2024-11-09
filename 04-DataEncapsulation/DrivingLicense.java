public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        int currentyear = 2024;
        if (yearOfIssue >= 1980 && yearOfIssue<currentyear){
            this.yearOfIssue = yearOfIssue;
        } else {
            System.out.println("Invalid year of issue, should be between 1980 and "+currentyear);
        }
    }
    // default year is set to 0, why not printing out the message

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }


    // Override the toString() method to display driving license information
    @Override
    public String toString() {
        return """ 
               Driving License Information: 
               Name: """ + getName() + " " + getSurname() + "\n" +
               "Address: " + getAddress() + ", " + getCity() + ", " + getPostalCode() + "\n" +
               "License Number: " + getLicenseNumber() + "\n" +
               "Year of Issue: " + getYearOfIssue() + "\n" +
               "Category: " + getLicenseCategory();
    }
    // kurwa
    // beginning of the code textblock created, /n doesn't work for some reason
}

