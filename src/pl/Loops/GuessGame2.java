package pl.Loops;

import java.util.Scanner;

public class GuessGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int number = 500;
        int userInput;

        do {
            System.out.println("Zgadnij liczbę");
            userInput = scanner.nextInt();
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else if (userInput < number) {
                System.out.println("Podana liczba jest za mała, zgaduj dalej");
            }
        } while (userInput != number) ;
        System.out.println("Brawo, zgadłeś o jaką liczbę chodziło!");
        scanner.close();
    }
}
