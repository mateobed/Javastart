package pl.AccesSpecifiersAndPackages;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014,"Audi", "A5", "Black");
        Car audiA4 = new Car(2015, "Audi", "A4");

        audiA4.setYear(-1000);
        audiA4.printInfo();
        audiA5.printInfo();
    }
}
