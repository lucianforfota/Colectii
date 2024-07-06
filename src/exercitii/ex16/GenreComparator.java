package exercitii.ex16;

import java.util.Comparator;

public class GenreComparator implements Comparator<Book> {


    @Override
    public int compare(Book b1, Book b2) {
        return b1.getGenre().compareTo(b2.getGenre());
    }
}
