public class Patient {


    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Patient [ firstname: " + firstName +
                ", lastName: " + lastName +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                ", city: " + city +
                ", state: " + state +
                ", zip: " + zip +
                ", phone: " + phone + " ]";
    }

}
