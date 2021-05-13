package pl.Encapsulation.Ex2.system;

import pl.Encapsulation.Ex2.model.Client;
import pl.Encapsulation.Ex2.model.MovieShow;
import pl.Encapsulation.Ex2.model.Ticket;

class CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "Horror", 128, 18, 72,72);
        TicketSystem ticketSystem = new TicketSystem();

        Client client1 = new Client("Jan", "Kowalski", 16);
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        System.out.println("Sprzedane bilety: ");
        if(ticket1 != null){
            System.out.println(ticket1.getInfo());
        }

        if(ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));

    }
}