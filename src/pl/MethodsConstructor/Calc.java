package pl.MethodsConstructor;

public class Calc {
    // typ zwracany (void) nazwaMetody(opcjonalne_parametry) { return }

    int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    void addAndPrint(int x, int y) {
        int sum = addTwoNumbers(x,y);
        System.out.println(sum);
    }
}
