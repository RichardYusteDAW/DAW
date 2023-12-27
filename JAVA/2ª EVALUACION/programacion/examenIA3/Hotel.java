package examenIA3;

import java.time.LocalDate;

public class Hotel {
    private String hotelName;
    private LocalDate date;
    private float price;
    private int rooms;

    public Hotel(String hotelName, LocalDate date, float price, int rooms) {
        this.hotelName = hotelName;
        this.date = date;
        this.price = price;
        this.rooms = rooms;
    }

    public void showDetails() {
        System.out.println("Name: " + hotelName +
                "\nDate: " + date +
                "\nPrice: " + price +
                "\nRooms: " + rooms);
    }
}