package pl.MethodsConstructor.Ex4;

public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10000,1000);
        System.out.println(home.getStatus());
        System.out.println("Bierzemy prysznic");
        home.takeShower();
        System.out.println(home.getStatus());
        System.out.println("Bierzemy kąpiel");
        home.takeBath();
        System.out.println(home.getStatus());
        System.out.println("Robimy obiad");
        home.makeDinner();
        System.out.println(home.getStatus());
        System.out.println("Gotujemy wodę");
        home.boilWater();
        System.out.println(home.getStatus());
        System.out.println("Oglądamy telewizję przez 4 godziny");
        home.watchTv(4);
        System.out.println(home.getStatus());


    }
}
