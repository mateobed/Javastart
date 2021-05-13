package pl.Encapsulation.Ex2.system;

import pl.Encapsulation.Ex2.model.Client;
import pl.Encapsulation.Ex2.model.MovieShow;
import pl.Encapsulation.Ex2.model.Ticket;

public class TicketSystem {

    Ticket createTicket(MovieShow movieShow, Client client){
        if (movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }
}
