package examenIA3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();

        Client client1 = new Client("Pepe", "Garcia", "1", "pepegarcia@gmail.com", "11111");
        Client client2 = new Client("Jose", "Perez", "2", "joseperez@gmail.com", "22222");

        Flight flight1 = new Flight("Valencia", LocalDate.of(2024, 1, 1), 100);
        Flight flight2 = new Flight("Madrid", LocalDate.of(2024, 1, 2), 200);

        Hotel hotel1 = new Hotel("Hotel Miramar", LocalDate.of(2024, 1, 1), 50, 10);
        Hotel hotel2 = new Hotel("Hotel Montaña", LocalDate.of(2024, 1, 2), 25, 5);

        Booking booking1 = new Booking(client1, flight1, hotel1);
        Booking booking2 = new Booking(client2, flight2, hotel2);

        travelAgency.addBooking(booking1);
        travelAgency.addBooking(booking2);

        travelAgency.showBookings();
    }
}