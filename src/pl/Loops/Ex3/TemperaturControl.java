package pl.Loops.Ex3;

import java.util.Scanner;

public class TemperaturControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę aktualną: ");
        double currentTemperature = scanner.nextDouble();
        System.out.println("Podaj temperaturę docelową: ");
        int targetTemperature = scanner.nextInt();

        Thermostat thermostat = new Thermostat(currentTemperature, targetTemperature);

        while(!thermostat.targetTemperatureReached()){
            System.out.println("Aktualną temperatura: " + thermostat.getCurrentTemperature());
            thermostat.adjustTemperature();
        }

        System.out.println("Osiągnięto docelową temperaturę " + thermostat.getCurrentTemperature() + " stopni");
    }
}
