import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Property property = registerProperty();
        Owner owner = registerOwner();
        System.out.println(property);
        System.out.println(owner);
    }

    public static Property registerProperty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the property iptu: ");
        String iptu = scanner.nextLine();
        System.out.println("Enter property address street name: ");
        String street = scanner.nextLine();
        System.out.println("Enter property address number: ");
        String number = scanner.nextLine();
        System.out.println("Enter property address zip code: ");
        String zipCode = scanner.nextLine();
        System.out.println("Enter property address state: ");
        String state = scanner.nextLine();
        System.out.println("Enter property address city: ");
        String city = scanner.nextLine();
        System.out.println("Enter property type: ");
        String type = scanner.nextLine();
        System.out.println("Enter property usage: ");
        String usage = scanner.nextLine();

        scanner.close();

        Address address = new Address(street, number, zipCode, state, city);
        Property property = new Property(iptu, type, usage, address);
        System.out.println("Property registered successfully!");

        return property;
    }

    public static Owner registerOwner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner name: ");
        String name = scanner.nextLine();
        System.out.println("Enter owner cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Enter owner rg: ");
        String rg = scanner.nextLine();
        System.out.println("Enter owner phone: ");
        String phone = scanner.nextLine();
        System.out.println("Enter owner address street name: ");
        String street = scanner.nextLine();
        System.out.println("Enter owner address number: ");
        String number = scanner.nextLine();
        System.out.println("Enter owner address zip code: ");
        String zipCode = scanner.nextLine();
        System.out.println("Enter owner address state: ");
        String state = scanner.nextLine();
        System.out.println("Enter owner address city: ");
        String city = scanner.nextLine();

        scanner.close();

        Address address = new Address(street, number, zipCode, state, city);
        Owner owner = new Owner(name, cpf, rg, phone, address);
        System.out.println("Owner registered successfully!");

        return owner;
    }
}
