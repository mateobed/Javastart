package pl.TypyDanychZmienne;

public class UpAndDown {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 3;
        int q = 3;

        // inkrementacja
        System.out.println(x); // 3
        System.out.println(x++); // 3
        System.out.println(x); // 4
        System.out.println();
        System.out.println(z); // 3
        System.out.println(++z); //4

        // dekrementacja
        System.out.println(y); // 3
        System.out.println(y--); // 3
        System.out.println(y); // 2
        System.out.println();
        System.out.println(q); // 3
        System.out.println(--q); // 2
    }
}
