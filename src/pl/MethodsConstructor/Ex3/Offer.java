package pl.MethodsConstructor.Ex3;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product pro, double pri, boolean spec) {
    product = pro;
    price = pri;
    special = spec;
    }

    void printInfo() {
        System.out.println(product.name + " " + product.producer +  " " + price
                + "zł " + "oferta specjalna? " + special);
    }
}
