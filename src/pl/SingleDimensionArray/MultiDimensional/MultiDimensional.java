package pl.SingleDimensionArray.MultiDimensional;

public class MultiDimensional {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Kasia", "Basia"};
        String[] lastNames = {"Kowalski", "Nowakowska", "Wadecka"};

        String [][] firstLast = {firstNames, lastNames};

        System.out.println("Pierwsza osoba to: ");
        System.out.print(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
        // to samo co:
        System.out.println(firstNames[0] + " " + lastNames[0]);

        System.out.println(firstLast.length);
        System.out.println(firstLast[0].length);




    }
}
