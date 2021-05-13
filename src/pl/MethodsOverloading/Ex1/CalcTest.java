package pl.MethodsOverloading.Ex1;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 30;
        double b = 20;
        double c = 10;

        System.out.println("A: " + a + ", B: " + b + ", C: " + c);

        System.out.println("A + B = " + calc.add(a,b));
        System.out.println("A + B + C = " + calc.add(a,b,c));

        System.out.println("A - B = " + calc.substract(a,b));
        System.out.println(("A - B - C = " + calc.substract(a,b,c)));


    }
}
