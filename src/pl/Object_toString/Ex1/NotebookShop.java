package pl.Object_toString.Ex1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("APPLE", 5));
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("APPLE", 6));
        dataStore.add(new Computer("HP", 67891));

        Computer compToFind = new Computer("ASUS", 12345);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }

    }
}
