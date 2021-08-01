package pl.AbstractInterface.Other;

public interface Boat {

    public default void printName(){
        System.out.println("Boat");
    }
}
