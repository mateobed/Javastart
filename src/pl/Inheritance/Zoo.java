package pl.Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setColor("Czarny");
        Bird bird1 = new Bird();
        bird1.setColor("Niebieski");

        System.out.println("Kot wydaje głos: ");
        cat1.makeSound();

        System.out.println("Ptak wydaje głos: ");
        bird1.makeSound();

    }
}
