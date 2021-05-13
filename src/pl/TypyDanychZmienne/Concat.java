package pl.TypyDanychZmienne;

public class Concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        System.out.println();
        int x = 2;
        int y = 3;
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum); // 2+3=5
        System.out.println(x + y + " to wynik sumowania");
        System.out.println("wynik sumowania to " + x + y);
        System.out.println("wynik sumowania to " + (x + y));

        System.out.println("Prawa to w programowaniu wartość " + true);
        System.out.println("Cz x jest większe od 0 " + (x>0));



    }
}
