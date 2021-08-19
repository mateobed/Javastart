package pl.Polymorphism;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void giveSound() {
        super.giveSound();
    }
    public void bark(){
        System.out.println("Hau hau");
    }
}
