package pl.TypyDanychZmienne;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        var lastName = "Kowalski";
        int age = 25;
        double height = 180.0;
        final String pesel = "1234567890";


        System.out.println(firstName + " ma " + 25 + " lat");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName +" ma wzrost " + height + "cm");
        System.out.println("Jeśli " + firstName + " urośnie o 5 cm, to będzie miał " + (height + 5) + " cm");
    }
}
