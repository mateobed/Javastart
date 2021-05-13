package pl.Scanner.Ex1.app;

import pl.Scanner.Ex1.logic.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczbę A: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj operator matematyczny: +, -, *, /");
        String operator = scanner.nextLine();
        System.out.println("Podaj liczbę B: ");
        double b = scanner.nextDouble();

        scanner.close();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a,b,operator);

        System.out.println("Wynikiem działanie jest liczba: " + result);


    }
}
