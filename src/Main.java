public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("João", "12345678910", "123456789", "123456789", new Address("Rua 1", "123", "12345678", "SP", "SP"));
        Property property = new Property("123456789", "Casa", "Residencial", new Address("Rua 2", "123", "12345678", "SP", "SP"));
        owner.addProperty(property);
        System.out.println(owner);
    }
}
