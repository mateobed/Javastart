package pl.Inheritance.vehicles;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setDoors(5);
        car1.setWheels(4);
        car1.setEngine(new Engine(120,"Diesel"));

        Boat boat1 = new Boat();
        boat1.setFuel(4);
        System.out.println("Wyporność: " + boat1.getDisplacement() + " , poziom paliwa: " + boat1.getFuel());

        car1.printInfo();





    }
}
