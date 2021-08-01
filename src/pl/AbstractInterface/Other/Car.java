package pl.AbstractInterface.Other;

public interface Car {
    public default void printName(){
        System.out.println("Car");
    }

}
