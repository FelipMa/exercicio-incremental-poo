public class Address {
    private String street;
    private String number;
    private String zipCode;
    private String state;
    private String city;
    private enum States {
        AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO
    }

    public Address(String street, String number, String zipCode, String state, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
        for (States s : States.values()) {
            if (s.name().equals(state)) {
                this.state = state;
                break;
            }
        }
        if (this.state == null) {
            throw new IllegalArgumentException("State must be a valid state");
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
        for (States s : States.values()) {
            if (s.name().equals(state)) {
                this.state = state;
                break;
            }
        }
        if (this.state == null) {
            throw new IllegalArgumentException("State must be a valid state");
        }
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
