package pl.SingleDimensionArray.Ex2;

public class ElevatorSimulator {
    public static void main(String[] args) {
        Person person1 = new Person(1,60);
        Person person2 = new Person(2,180);
        Person person3 = new Person(3,150);
        Person person4 = new Person(4,120);
        Person person5 = new Person(5,70);

        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);

        elevator.elevatorOccupancy();

        elevator.start();

        elevator.out(4);

        elevator.elevatorOccupancy();












    }
}
