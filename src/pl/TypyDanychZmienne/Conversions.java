package pl.TypyDanychZmienne;

public class Conversions {

    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        int c = (int) b; // konwersja zawężająca: typ ogólniejszy do typu mniejszego
        double d = (double) a; // konwersja rozszerzająca: niejawna czyli zbędna każdy int zmiesci sie w double
        System.out.println(c);
        System.out.println(d);
    }
}
