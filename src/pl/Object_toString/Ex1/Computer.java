package pl.Object_toString.Ex1;

import java.util.Objects;

public class Computer {
    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getModel() == computer.getModel() && Objects.equals(getProducer(), computer.getProducer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducer(), getModel());
    }

    @Override
    public String toString() {
        return producer + " " + model;
    }
}
