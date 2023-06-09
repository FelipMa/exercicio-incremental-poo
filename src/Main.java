import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Property p1 = new AutonomousProperty("100.00", "apartment", "residential", "rua 1", "123", "123", "SP", "sp", 100,
                100);
        Property p2 = new SharedProperty("200.00", "house", "residential", "rua 2", "123", "123", "SP", "sp", "casa 2");

        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
        System.out.println("");

        System.out.println(calculatePropertyValueInSeason(p1, 1));
        System.out.println("");
        System.out.println(calculatePropertyValueInSeason(p2, 3));
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
        System.out.println("Enter property address state, in caps: ");
        String state = scanner.nextLine();
        System.out.println("Enter property address city: ");
        String city = scanner.nextLine();
        System.out.println("Enter property type: ");
        String type = scanner.nextLine();
        System.out.println("Enter property usage: ");
        String usage = scanner.nextLine();
        System.out.println("Enter property autonomy (autonomous/shared): ");
        String autonomy = scanner.nextLine();
        if (autonomy.equals("autonomous")) {
            System.out.println("Enter property useful area: ");
            float usefulArea = scanner.nextFloat();
            System.out.println("Enter property constructed area: ");
            float constructedArea = scanner.nextFloat();
            AutonomousProperty property = new AutonomousProperty(iptu, type, usage, street, number, zipCode, state, city,
                    usefulArea, constructedArea);
            System.out.println("Property registered successfully!");
            return property;
        } else if (autonomy.equals("shared")) {
            System.out.println("Enter property identification: ");
            String identification = scanner.nextLine();
            SharedProperty property = new SharedProperty(iptu, type, usage, street, number, zipCode, state, city,
                    identification);
            System.out.println("Enter condominium laisure items, one for each line, when finished type 'end': ");
            String laisureItems = scanner.nextLine();
            while (!laisureItems.equals("end")) {
                property.addLaisureItem(laisureItems);
                laisureItems = scanner.nextLine();
            }
            System.out.println("Property registered successfully!");
            return property;
        } else {
            System.out.println("Invalid autonomy!");
            return null;
        }
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

        Owner owner = new Owner(name, cpf, rg, phone, street, number, zipCode, state, city);
        System.out.println("Owner registered successfully!");

        return owner;
    }

    public static Property setUnavailableDate(Property property) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unavailable date day: ");
        int day = scanner.nextInt();
        System.out.println("Enter unavailable date month (number): ");
        int month = scanner.nextInt();
        System.out.println("Enter unavailable date year: ");
        int year = scanner.nextInt();

        Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
        if (month > 0 && month <= 12)
            date.set(Calendar.MONTH, month - 1);
        else {
            System.out.println("Invalid month!");
            return property;
        }
		date.set(Calendar.DAY_OF_MONTH, day);
        
        property.getSchedule().addUnavailableDate(date);
        System.out.println("Unavailable date set successfully!");
        return property;
    }

    public static float calculatePropertyValue(Property property) {
        float value = property.calculateValue(); // método polimórfico, eu acho
        return value;
    }

    public static float calculatePropertyValueInSeason(Property property, int season) {
        float value = property.calculateValue();
        float valueInSeason = -1.0f;
        if (season == 0) {
            valueInSeason = value;
        } else if (season == 1) {
            valueInSeason = value + (value * 0.2f);
        } else if (season == 2) {
            valueInSeason = value + (value * 0.15f);
        } else if (season == 3) {
            valueInSeason = value + (value * 0.1f);
        } else if (season == 4) {
            valueInSeason = value + (value * 0.05f);
        } else {
            System.out.println("Invalid season!");
        }
        return valueInSeason;
    }
}
