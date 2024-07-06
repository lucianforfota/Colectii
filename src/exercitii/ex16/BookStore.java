package exercitii.ex16;

import java.util.*;

public class BookStore {
    private Set<Book> books;

    public BookStore() {
        books = new HashSet<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }
}
