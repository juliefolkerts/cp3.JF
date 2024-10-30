import java.time.Year;

public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalcode;
    private String license_num;
    private int YearOfIssue;

    public void setName(String name){
        char first_letter = name.charAt(0);
        if (Character.isUpperCase(first_letter)==true){
            this.name = name;
        }

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public void setLicense_num(String license_num) {
        this.license_num = license_num;
    }
    public void setYearOfIssue(int YearOfIssue) {
        if (YearOfIssue > 1980 && YearOfIssue < 2024){
            this.YearOfIssue = YearOfIssue;
        }

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getLicense_num() {
        return license_num;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }
    


    
    
}
