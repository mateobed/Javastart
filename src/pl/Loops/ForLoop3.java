package pl.Loops;

public class ForLoop3 {
    public static void main(String[] args) {
        int [] tab = {5,10,15};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int i : tab) {
            System.out.println(i);
        }
    }
}
