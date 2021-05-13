package pl.StaticComponents.Ex2;

import java.util.Scanner;

public class KitchenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile szklanek wody potrzebujesz do przepisu ?");
        double waterGlasses = scanner.nextDouble();
        System.out.println("Ile łyżeczek oleju potrzebujsz ?");
        double oilSpoons = scanner.nextDouble();
        System.out.println("Ile łyżeczek miodu potrzebujsz ?");
        double honeySpoons = scanner.nextDouble();

        System.out.println("Do przepisu potrzebujesz: ");
        System.out.println(waterGlasses + " szklanki wody, czyli " + KitchenUtils.glassesToMl(waterGlasses) + " ml wody");
        System.out.println(oilSpoons + " łyżek oleju, czyli " + KitchenUtils.spoonsToMl(oilSpoons) + " ml oleju");
        System.out.println(honeySpoons + " łyżeczek miodu, czyli " + KitchenUtils.teaspoonsToMl(honeySpoons) + " ml miodu");




    }

}
