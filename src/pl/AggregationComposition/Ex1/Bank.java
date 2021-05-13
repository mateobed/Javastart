package pl.AggregationComposition.Ex1;

public class Bank {
    public static void main(String[] args) {
        // pierwsza osoba:
        Person person1 = new Person();
        person1.firstName = "Mateusz";
        person1.lastName = "Bednarczyk";
        person1.pesel = "86061312098";
        // tworzymy adres:
        Address address1 = new Address();
        address1.city = "Sosnowiec";
        address1.postalCode = "41-219";
        address1.street = "Wapienna";
        address1.home = 73;
        address1.flat = 2;
        // taki sam adres zamieszkania i zameldowania:
        person1.registeredAddress = address1;
        person1.livingAddress = address1;
        // pierwsze konto bankowe:
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        //druga osoba:
        Person person2 = new Person();
        person2.firstName = "Marek";
        person2.lastName = "Nowak";
        person2.pesel = "88082332987";
        // tworzymy adres:
        Address address2 = new Address();
        address2.city = "Katowice";
        address2.postalCode = "40-100";
        address2.street = "Mickiewicza";
        address2.home = 12;
        address2.flat = 78;
        person2.registeredAddress = address2;
        person2.livingAddress = address1;
        // drugie konto bankowe:
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        System.out.println("Osoba 1: ");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("Miejscowość zamieszkania to: " + person1.livingAddress.city);
        System.out.println("Miejscowość zameldowania to: " + person1.registeredAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println();
        System.out.println("Osoba 2: ");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("Miejscowość zamieszkania to: " + person2.livingAddress.city);
        System.out.println("Miejscowość zameldowania to: " + person2.registeredAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account2.balance);

    }
}
