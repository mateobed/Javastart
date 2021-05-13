package pl.Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Podaj liczbę do sprawdzenia: ");
            int tmp = scanner.nextInt();

            if(tmp % 2 == 0){
                System.out.println("Liczba " + tmp + " jest parzysta");
            } else {
                System.out.println("Liczba " + tmp + " jest nieparzysta" );
            }
        }

    }
}
