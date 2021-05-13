package pl.ControlStructures;

public class ControlStructures {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        if (a>b) {
            if (a > c) {
                System.out.println("Liczba A jest większa od B i od C");
            } else {
                System.out.println("A jest większe od B, ale mniejsze bądź równe od C");
            }
        } else {
            System.out.println("A jest mniejsze od B");
        }

        boolean aPositive = a > 0;
        boolean aEven = a % 2 == 0;

        if(aPositive && aEven) {
            System.out.println("A jest liczbą parzystą i dodatnią");
        }
    }
}
