package pl.Inheritance.Ex1;

public class MotoShop {
    public static void main(String[] args) {
        Tire tire = new Tire(1234,"Michel","Alfa", "Autmun", 25, 22.5);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(56789,"Dewoe", "Kart", "Koser", true);
        exhaustPart.printInfo();

    }
}
