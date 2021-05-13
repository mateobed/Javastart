package pl.MethodsOverloading.Ex2;

import java.util.Random;

public class Dice {
    Random random = new Random();
    int top;

    Dice() {
        roll();
    }

    Dice(int top) {
        this.top = top;
    }

    void roll() {
        top = random.nextInt(6) + 1;
        System.out.println("Liczba oczek na kostce: " + top);
    }

    void printInfo() {
        System.out.println("Liczba oczek na kostce: " + top);
    }
}
