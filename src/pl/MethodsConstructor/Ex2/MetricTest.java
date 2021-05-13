package pl.MethodsConstructor.Ex2;

public class MetricTest {
    public static void main(String[] args) {
    MetricConverter converter = new MetricConverter();
    double m = 2.5;
    double cm = 234;
    double mm = 24342;

        System.out.println(m + "m to: " + converter.metersToCm(m) + "cm i "
                + converter.metersToMm(m) + "mm");
        System.out.println(cm + "cm to: " + converter.cmToMeters(cm) + "metrów");
        System.out.println(mm + "mm to: " + converter.mmToMeters(mm) + "metrów");
    }
}
