package pl.TypyDanychZmienne;

public class CompareOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("Czy X jest większy od Y?");
        boolean isXgreataterThenY = x > y;
        System.out.println(isXgreataterThenY);

        boolean xEqualsY = x==y;
        System.out.println("Czy X jest równe Y ? " + xEqualsY);
        System.out.println(!xEqualsY);

        boolean xDiffersY = x!=y;
        System.out.println("Czy X jest różne od Y ? " + xDiffersY);
    }
}
