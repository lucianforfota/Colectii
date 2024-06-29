package exercitii.ex20IMDBclone;

import java.util.List;
import java.util.Set;

public class Movie {
    private String title;
    private Integer releaseYear;
    private Genre genre;
    private Set<Actor> cast;
    private Type type;
    List<Review> reviewList;

    public Movie(String title, Integer releaseYear, Genre genre, Set<Actor> cast, Type type, List<Review> reviewList) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.cast = cast;
        this.type = type;
        this.reviewList = reviewList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
}
