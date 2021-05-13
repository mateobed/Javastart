package pl.AccesSpecifiersAndPackages.Ex2.application;

import pl.AccesSpecifiersAndPackages.Ex2.Charger;
import pl.AccesSpecifiersAndPackages.Ex2.model.Telephone;

public class TelephoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy", 3400, 75);
        System.out.println(telephone.getInfo());

        Charger charger = new Charger();
        charger.charge(telephone);

        System.out.println(telephone.getInfo());








    }
}
