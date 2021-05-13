package pl.MethodsOverloading;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014,"Audi", "A5", "Black");
        Car audiA4 = new Car(2015,"Audi", "A4");

        // w międzyczasie klient wybiera kolor:
        audiA4.color = "Czerwony";

        audiA5.getInfo();
        audiA4.getInfo();

    }
}
