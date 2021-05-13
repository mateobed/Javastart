package pl.TypyDanychZmienne;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Czy X jest mniejsze od 0 lub Y jest większe od zera");
        System.out.println(x<0);
        System.out.println(y>0);
        System.out.println(x < 0 || y > 0); // ALTERNATYWA
        // || - operator alternatywy. Zwraca true, gdy co najmniej jeden z warunków jest spełniony,
        // czyli true || false lub false || true lub true || true.

        System.out.println("Czy X jest mniejsze od 0 i Y jest większe od zera");
        System.out.println(x < 0 && y > 0); // KONIUNKCJA
        // && - operator koniunkcji. Zwraca true tylko i wyłącznie wtedy kiedy zachodzi true && true,




    }
}
