package pl.MethodsConstructor.Ex3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada milka", "Milka");
        Offer offer1 = new Offer(product1, 3.99, true);
        offer1.printInfo();

    }
}
