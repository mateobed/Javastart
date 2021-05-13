package pl.MethodsConstructor;

public class Test {
    public static void main(String[] args) {
    Calc calc = new Calc();
    int result1 = calc.addTwoNumbers(10,15);
    int result2 = calc.addTwoNumbers(15,25);
    int result3 = calc.addTwoNumbers(55,55);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(calc.addTwoNumbers(55,55));

        Calc calc1 = new Calc();
        calc1.addAndPrint(5,10);
        calc1.addAndPrint(50,10);

    }
}
