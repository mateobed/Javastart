package pl.Inheritance.vehicles;

import pl.Inheritance.vehicles.Engine;

public class Vehicle {
    private Engine engine;
    private double fuel;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
