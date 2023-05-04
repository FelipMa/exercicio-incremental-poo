import java.util.ArrayList;

public class Owner {
    private String name;
    private String cpf;
    private String rg;
    private String phone;
    private Address address;
    private ArrayList<Property> properties = new ArrayList<Property>();

    public Owner(String name, String cpf, String rg, String phone, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public void removeProperty(String iptu) {
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).getIptu().equals(iptu)) {
                this.properties.remove(i);
            }
        }
    }

    public void printPropertiesFromType(String type) {
        for (int i = 0; i < this.properties.size(); i++) {
            if (this.properties.get(i).getType().equals(type)) {
                System.out.println(this.properties.get(i));
            }
        }
    }
}
