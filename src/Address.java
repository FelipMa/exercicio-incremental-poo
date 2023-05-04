public class Address {
    private String street;
    private String number;
    private String zipCode;
    private String state;
    private String city;

    public Address(String street, String number, String zipCode, String state, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        if (state.length() != 2) {
            throw new IllegalArgumentException("State must have 2 characters");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + 
            "street='" + street + '\'' + 
            ", number='" + number + '\'' + 
            ", zipCode='" + zipCode + '\'' + 
            ", state='" + state + '\'' + 
            ", city='" + city + '\'' +  "}";
    }
}
