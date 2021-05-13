package pl.StaticComponents;

public class Calculator {

    static final double PI = 3.141592;

    static double circleArea(double r){
        return PI * r * r;
    }

    static double circlePermiter(double r) {
        return 2 * PI * r;
    }
}
