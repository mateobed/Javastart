package pl.Encapsulation;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true);
        double price = 1100;
        DiscountService discountService = new DiscountService();
        PrintService printService = new PrintService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        double discountPrice2= discountService.calculateDiscountPrice(client2, price2);

        printService.printSummary(client1,price,discountPrice);
    }


}
