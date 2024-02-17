package examenIA4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String colorRojo = "\u001B[31m";
    private String colorVerde = "\u001B[32m";
    private String colorAzul = "\u001B[34m";
    private String resetColor = "\u001B[0m";

    List<Book> books;
    List<User> users;
    List<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void registerLoan(Loan loan) {
        loans.add(loan);
    }

    public void showLibraryStatus() {
        System.out.println(colorVerde + "Books:" + resetColor);
        for (Book book : books) {
            book.showDetails();
        }
        System.out.println(colorAzul + "Users:" + resetColor);
        for (User user : users) {
            user.showInfo();
        }
        System.out.println(colorRojo + "Loans:" + resetColor);
        for (Loan loan : loans) {
            loan.showLoanDetails();
        }
    }
}
