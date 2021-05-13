package pl.StaticComponents;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 186.5);
        Human ewa = new Human("Ewa", 167.5);

        Human.avgHeight = (adam.getHeight() + ewa.getHeight() / 2);

        System.out.println("Pierwsi ludzie na Ziemi: ");
        System.out.println(adam.getName() + ", " + adam.getHeight() + " cm wzrostu");
        System.out.println(ewa.getName() + ", " + ewa.getHeight() + " cm wzrostu");

        System.out.println("Średnia wzrostu: ");
        System.out.println(Human.avgHeight);
    }
}
