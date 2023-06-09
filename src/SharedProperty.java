public class SharedProperty extends Property {
    private String identification;
    private Condominium condominium;

    public SharedProperty(String iptu, String type, String usage, String street, String number, String zipCode,
            String state, String city, String identification) {
        super(iptu, type, usage, street, number, zipCode, state, city);
        this.identification = identification;
        this.condominium = new Condominium(street, number, zipCode, state, city);
        this.setValue(this.calculateValue());
    }

    public SharedProperty(String iptu, String type, String usage, String street, String number, String zipCode,
            String state, String city, String identification, Owner owner) {
        super(iptu, type, usage, street, number, zipCode, state, city, owner);
        this.identification = identification;
        this.condominium = new Condominium(street, number, zipCode, state, city);
        this.setValue(this.calculateValue());
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Condominium getCondominium() {
        return condominium;
    }

    public void addLaisureItem(String item) {
        this.condominium.addLaisureItem(item);
        this.setValue(this.calculateValue());
    }

    @Override
    public float calculateValue() {
        float value = 0;
        float iptuValue = Float.parseFloat(this.getIptu());
        if (this.getCondominium().getLaisureItems().size() > 0) {
            value = this.getCondominium().getLaisureItems().size() * iptuValue;
        } else {
            value = iptuValue * 0.9f;
        }
        return value;
    }

    @Override
    public String toString() {
        return "SharedProperty{" + super.toString() + "identification=" + identification + ", condominium=" + condominium + '}';
    }
}
