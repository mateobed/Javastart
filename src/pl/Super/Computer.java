package pl.Super;

public class Computer {
    private double cpuTemperature; // temp procesora
    private double ramMemory; // MB

    public Computer(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    public Computer(double cpuTemperature, double ramMemory) {
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }

    public double getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    void printInfo(){
        System.out.println("Computer: " + getCpuTemperature() + ", " + getRamMemory());
    }

    public void coolDown(){
        cpuTemperature -= 1;
    }

}
