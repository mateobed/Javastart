package pl.TypyDanychZmienne;

import java.util.Random;

public class Variables_Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100); // losowanie liczb z przedziału 0-9, 10 się nie wlicza
        int y = new Random().nextInt(100); // krótsza wersja
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Czy x jest większe od y ?: " + (x > y));
        System.out.println("Czy x pomnożone przez 2 jest większe od y ?: " + ((x*2)>y));
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2 ?: " + ((y<(x+3) && (y>(x-2)))));
        System.out.println("Czy iloczyn liczb x i y jest parzysty ?: " + (((x*y) % 2 == 0)));
    }
}
