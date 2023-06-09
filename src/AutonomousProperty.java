public class AutonomousProperty extends Property{
    private float usefulArea;
    private float constructedArea;

    public AutonomousProperty(String iptu, String type, String usage, String street, String number, String zipCode,
            String state, String city, Owner owner, float usefulArea, float constructedArea) {
        super(iptu, type, usage, street, number, zipCode, state, city, owner);
        this.usefulArea = usefulArea;
        this.constructedArea = constructedArea;
        this.setValue(this.calculateValue());
    }

    public AutonomousProperty(String iptu, String type, String usage, String street, String number, String zipCode,
            String state, String city, float usefulArea, float constructedArea) {
        super(iptu, type, usage, street, number, zipCode, state, city);
        this.usefulArea = usefulArea;
        this.constructedArea = constructedArea;
        this.setValue(this.calculateValue());
    }

    public float getUsefulArea() {
        return usefulArea;
    }

    public void setUsefulArea(float usefulArea) {
        this.usefulArea = usefulArea;
    }

    public float getConstructedArea() {
        return constructedArea;
    }

    public void setConstructedArea(float constructedArea) {
        this.constructedArea = constructedArea;
    }

    @Override
    public float calculateValue() {
        float value = this.getConstructedArea() * 15;
        return value;
    }

    @Override
    public String toString() {
        return "AutonomousProperty{ + " + super.toString() + "usefulArea=" + usefulArea + ", constructedArea=" + constructedArea + '}';
    }
}


