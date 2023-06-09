import java.util.Calendar;

public abstract class Property implements PropertyAplicationInterface{
    private String iptu;
    private String type;
    private String usage;
    private Address address;
    private Schedule schedule;
    private Owner owner;
    private float value;

    public Property(String iptu, String type, String usage, String street, String number, String zipCode, String state,
            String city, Owner owner) {
        this.iptu = iptu;
        this.type = type;
        this.usage = usage;
        this.address = new Address(street, number, zipCode, state, city);
        this.schedule = new Schedule();
        this.owner = owner;
        this.value = 0;
    }

    public Property(String iptu, String type, String usage, String street, String number, String zipCode, String state,
            String city) {
        this(iptu, type, usage, street, number, zipCode, state, city, null);
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
                "iptu='" + getIptu() + '\'' +
                ", type='" + getType() + '\'' +
                ", usage='" + getUsage() + '\'' +
                ", address=" + getAddress() + '\'' +
                ", schedule=" + getSchedule() + '\'' +
                ", owner=" + getOwner() + '\'' +
                ", value=" + getValue() +
                '}';
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public abstract float calculateValue();

    @Override
    public boolean checkPropertyAvailability(Calendar startDate, Calendar endDate) {
        return this.schedule.checkAvailability(startDate, endDate);
    }

    @Override
    public float checkPropertyTotalValue(Calendar startDate, Calendar endDate) {
        long milis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        long days = milis / (1000 * 60 * 60 * 24);
        if (days < 1) {
            days = 1;
        }
        float value = this.calculateValue();
        return value * days;
    }

    public float calculatePropertyValue(Calendar date) {
        return this.calculateValue();
    }
}
