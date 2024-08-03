package exercitii.ex16;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<Genre, List<Book>> getAllBooksByGenre() {
        Map<Genre, List<Book>> groupBooksByGenre = new HashMap<>();
        for (Book book : books) {
            if (!groupBooksByGenre.containsKey(book.getGenre())) {
                List<Book> booksValue = new ArrayList<>();
                booksValue.add(book);
                groupBooksByGenre.put(book.getGenre(), booksValue);
            } else {
                groupBooksByGenre.get(book.getGenre()).add(book);
            }
        }
        return groupBooksByGenre;
    }

    public List<Book> findBooksByGenre(Genre genre) {
        List<Book> findBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }

    public List<Book> findBooksByGenreLambda(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }

    public void addBook(Book book) throws Exception {
        if (!books.contains(book)) {
            books.add(book);
        } else{
            throw new Exception("book already exist");
        }
    }

    public List<Book> getBooksOrderedByYear(){
        List<Book> sortedBooks = new ArrayList<>(books);  // Create a copy of the books list
        Collections.sort(sortedBooks);  // Sort the copy
        return sortedBooks;
    }

    public List<Book> getBooksOrderedByAuthor(){
        List<Book> sortedBooks = new ArrayList<>(books);  // Create a copy of the books list
        Collections.sort(sortedBooks, new AuthorComparator());  // Sort the copy
        return sortedBooks;
    }




}

