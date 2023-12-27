package examenIA3;

import java.time.LocalDate;

public class Flight {
    private String destination;
    private LocalDate date;
    private float price;

    public Flight(String destination, LocalDate date, float price) {
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Destination: " + destination +
                "\nDate: " + date +
                "\nPrice: " + price);
    }
}