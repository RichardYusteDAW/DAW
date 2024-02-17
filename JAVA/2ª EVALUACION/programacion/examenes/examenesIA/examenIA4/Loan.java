package examenIA4;

import java.time.LocalDate;

public class Loan {
    private String colorAzul = "\u001B[34m";
    private String colorVerde = "\u001B[32m";
    private String resetColor = "\u001B[0m";

    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(User user, Book book, LocalDate loanDate, LocalDate returnDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public void showLoanDetails() {
        System.out.println(colorAzul + "User:" + resetColor);
        user.showInfo();
        System.out.println(colorVerde + "Book:" + resetColor);
        book.showDetails();
        System.out.println(colorVerde + "├── " + resetColor + "Loan date: " + loanDate);
        System.out.println(colorVerde + "├── " + resetColor + "Return date: " + returnDate);
    }
}
