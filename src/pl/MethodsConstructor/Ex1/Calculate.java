package pl.MethodsConstructor.Ex1;

public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double x = 54.6;
        double y = 22.9;
        System.out.println("X = " + x + " " + "Y = " + y);
        System.out.println("X+Y = " + calc.add(x,y));
        System.out.println("X-Y = " + calc.substract(x,y));
        System.out.println("X*Y = " + calc.multiply(x,y));
        System.out.println("X/Y = " + calc.divide(x,y));

    }
}
