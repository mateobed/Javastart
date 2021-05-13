package pl.AccesSpecifiersAndPackages.Ex2;

import pl.AccesSpecifiersAndPackages.Ex2.model.Telephone;

public class Charger {
    public void charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel()+1);
    }
}
