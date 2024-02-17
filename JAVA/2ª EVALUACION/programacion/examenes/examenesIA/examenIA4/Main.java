package examenIA4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John Doe", LocalDate.of(2019, 1, 1));
        User user2 = new User("Jane Doe", LocalDate.of(2019, 1, 1));

        Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954, "978-3-16-148410-0", 3);
        Book book2 = new Book("The Hobbit", "J. R. R. Tolkien", 1937, "978-3-16-148410-1", 2);

        Loan loan1 = new Loan(user1, book1, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 8));
        Loan loan2 = new Loan(user2, book2, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 8));

        Library library = new Library();
        library.addUser(user1);
        library.addUser(user2);
        library.addBook(book1);
        library.addBook(book2);
        library.registerLoan(loan1);
        library.registerLoan(loan2);

        library.showLibraryStatus();
    }
}
