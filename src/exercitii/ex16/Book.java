package exercitii.ex16;

public class Book implements Comparable<Book> {
    //Creează clasa Book
    //Atribute:
    //Year
    //Title
    //Genre
    //Author
    //Metode:
    //compareTo
    //(suprascrisă din interfața Comparable)
    //
    //Va compara cărțile după year

    public int year;
    public String title;

    public Genre genre;
    public String author;

    public Book(int year, String title, Genre genre, String author) {
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getYear() {
        return year;
    }


    public String getTitle() {
        return title;
    }



    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.year, book.year);
    }

}
