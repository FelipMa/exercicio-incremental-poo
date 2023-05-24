import java.util.Calendar;

public class Property {
    private String iptu;
    private String type;
    private String usage;
    private Address address;
    private Schedule schedule;
    private Owner owner;

    public Property(String iptu, String type, String usage, Address address) {
        this.iptu = iptu;
        this.type = type;
        this.usage = usage;
        this.address = address;
        this.schedule = new Schedule();
        this.owner = null;
    }

    public Property(String iptu, String type, String usage, String street, String number, String zipCode, String state,
            String city) {
        this.iptu = iptu;
        this.type = type;
        this.usage = usage;
        this.address = new Address(street, number, zipCode, state, city);
        this.schedule = new Schedule();
        this.owner = null;
    }

    public Property(String iptu, String type, String usage, String street, String number, String zipCode, String state,
            String city, Owner owner) {
        this.iptu = iptu;
        this.type = type;
        this.usage = usage;
        this.address = new Address(street, number, zipCode, state, city);
        this.schedule = new Schedule();
        this.owner = owner;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void addAvailableDate(Calendar date) {
        this.schedule.addAvailableDate(date);
    }

    public void addUnavailableDate(Calendar date) {
        this.schedule.addUnavailableDate(date);
    }

    public void addReservedDate(Calendar date) {
        this.schedule.addReservedDate(date);
    }

    public void removeAvailableDate(Calendar date) {
        this.schedule.removeAvailableDate(date);
    }

    public void removeUnavailableDate(Calendar date) {
        this.schedule.removeUnavailableDate(date);
    }

    public void removeReservedDate(Calendar date) {
        this.schedule.removeReservedDate(date);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        if (this.owner != null) {
            this.owner.removeProperty(this.iptu);
        }
        this.owner = owner;
        this.owner.addProperty(this);
    }

    @Override
    public String toString() {
        return "Property{" +
                "iptu='" + iptu + '\'' +
                ", type='" + type + '\'' +
                ", usage='" + usage + '\'' +
                ", address=" + address +
                ", schedule=" + schedule +
                ", owner=" + owner +
                '}';
    }
}
