import java.util.ArrayList;

public class Condominium {
    private Address address;
    private ArrayList<String> laisureItems = new ArrayList<String>();

    public Condominium(String street, String number, String zipCode, String state, String city) {
        this.address = new Address(street, number, zipCode, state, city);
    }

    public Address getAddress() {
        return address;
    }
    
    public void addLaisureItem(String item) {
        this.laisureItems.add(item);
    }

    public ArrayList<String> getLaisureItems() {
        return laisureItems;
    }

    @Override
    public String toString() {
        return "Condominium [address=" + address + ", laisureItems=" + laisureItems + "]";
    }
}
