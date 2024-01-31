package examenIA3;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Booking> bookings;

    public TravelAgency() {
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No hay reservas.");
            return;
        }

        for (Booking booking : bookings) {
            booking.showBookingDetails();
            System.out.println();
        }
    }
}