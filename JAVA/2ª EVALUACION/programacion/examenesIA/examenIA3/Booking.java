package examenIA3;

public class Booking {
    private Client client;
    private Flight flight;
    private Hotel hotel;

    public Booking(Client client, Flight flight, Hotel hotel) {
        this.client = client;
        this.flight = flight;
        this.hotel = hotel;
    }

    public void showBookingDetails() {
        System.out.println("Client Details:");
        client.showInfo();

        System.out.println("\nFlight Details:");
        flight.showDetails();

        System.out.println("\nHotel Details:");
        hotel.showDetails();
    }
}