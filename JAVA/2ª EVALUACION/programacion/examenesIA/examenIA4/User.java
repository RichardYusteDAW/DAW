package examenIA4;

import java.time.LocalDate;

public class User {
    private String colorAzul = "\u001B[34m";
    private String resetColor = "\u001B[0m";

    private String name;
    private LocalDate registeredDate;

    public User(String name, LocalDate registeredDate) {
        this.name = name;
        this.registeredDate = registeredDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void showInfo() {
        System.out.println(colorAzul + "├── " + resetColor + "Name: " + name);
        System.out.println(colorAzul + "├── " + resetColor + "Registered date: " + registeredDate);
    }
}
