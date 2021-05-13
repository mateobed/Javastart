package pl.TypyDanychZmienne;

public class Variables_Ex2 {
    public static void main(String[] args) {
        double netto = 100;
        double vat = 0.23;
        double vatAmount = netto * vat;
        double brutto = netto + vatAmount;
        System.out.println("Cena netto: " + netto);
        System.out.println("Kwota VAT: " + vatAmount);
        System.out.println("Do zapłaty brutto: " +brutto);

    }
}
