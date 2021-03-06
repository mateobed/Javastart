package pl.MethodsConstructor;

public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp3 = factory.create("Intel i7", 9216);
        Computer comp4 = factory.create("MacBook Pro", 2122);

        Computer comp1 = new Computer();
        comp1.processor = "Intel i5";
        comp1.memory = 8192;

        Computer comp2 = new Computer();
        comp2.processor = "AMD Ryzen 1700";
        comp2.memory = 16_384;

       comp1.printInfo();
       comp2.printInfo();
       comp3.printInfo();
       comp4.printInfo();

//        System.out.println(comp1.getInfo());
//        String info2 = comp2.getInfo();
//        System.out.println(info2);

        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1, 1024);
        comp1.printInfo();

    }
}
