package pl.MethodsConstructor;

public class ComputerStoreFinal {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i5", 8192);
        Computer comp2 = factory.create("AMD Ryzen 1700", 16_384);

        comp1.printInfo();
        comp2.printInfo();

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1,1024);
        comp1.printInfo();
    }
}
