package pl.MethodsConstructor;

public class Computer {
    String processor;
    int memory;

    void printInfo() {
        System.out.println(processor + " " + memory);
    }

    String getInfo() {
        return processor + " " + memory;
    }
}
