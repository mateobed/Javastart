package pl.Super;

public class ComputerStore {

    public static void main(String[] args) {
        Computer computer = new Computer(45,16384);
        computer.coolDown();
        Notebook notebook = new Notebook(40,8192,10000);
        notebook.coolDown();

        notebook.printInfo();
        computer.printInfo();


    }
}
