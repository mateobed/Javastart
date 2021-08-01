package pl.Exceptions.Throws;

import pl.Exceptions.Throws.Car;

class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(150);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);
        try {
            car.drive();
            car.drive();
            car.drive();
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        } finally {
            System.out.println("Zawsze się wykona!");
        }
        System.out.println(car);
    }
}
