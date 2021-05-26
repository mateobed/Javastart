package pl.Inheritance.vehicles;

import pl.Inheritance.vehicles.Vehicle;

public class WheeledVehicle extends Vehicle {
    private int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
