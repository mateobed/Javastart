package pl.Loops.Ex1;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz zsumować: ");
        int numbers = scanner.nextInt();

        int sum = 0;

        while (numbers-- > 0){
            System.out.println("Podaj kolejną liczbę");
            sum = sum + scanner.nextInt();
        }

        System.out.println("Suma wszystkich podanych liczb to: " + sum);
        scanner.close();
    }
}
