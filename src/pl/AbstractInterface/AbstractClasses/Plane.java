package pl.AbstractInterface.AbstractClasses;

public class Plane extends Vehicle{

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 100);
    }
}
