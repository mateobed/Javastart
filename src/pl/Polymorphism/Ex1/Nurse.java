package pl.Polymorphism.Ex1;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String firstName, String lastName, double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime;
    }
}
