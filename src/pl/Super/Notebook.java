package pl.Super;

public class Notebook extends Computer{
    private int batteryCapacity; // pojemność baterii mAh

    public Notebook(double cpuTemperature, double ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    void printInfo(){
        System.out.println("Notebook: " + getCpuTemperature() + ", " + getRamMemory() + ", " + getBatteryCapacity());
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getCpuTemperature() - 2);
    }
}
