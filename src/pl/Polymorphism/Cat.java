package pl.Polymorphism;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        super.giveSound();
    }

    public void meow(){
        System.out.println("Miał miał");
    }
}
