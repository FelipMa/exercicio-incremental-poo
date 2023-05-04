public class Property {
    private String iptu;
    private String type;
    private String usage;
    private Address address;

    public Property(String iptu, String type, String usage, Address address) {
        this.iptu = iptu;
        this.type = type;
        this.usage = usage;
        this.address = address;
    }

    public String getIptu() {
        return iptu;
    }

    public void setIptu(String iptu) {
        this.iptu = iptu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Property{" +
                "iptu='" + iptu + '\'' +
                ", type='" + type + '\'' +
                ", usage='" + usage + '\'' +
                ", address=" + address +
                '}';
    }
}
