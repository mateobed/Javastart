package pl.ControlStructures.Ex2;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        NumberUtils numberUtils = new NumberUtils();
        numberUtils.CompareNumberAndPrint(randomNumber, 5000);
        numberUtils.printOddOrEven(randomNumber);
        System.out.println("Uzupełniona do 4 cyfr: " + numberUtils.getFourDigitNumber(randomNumber));
    }
}
