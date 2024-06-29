package exercitii.ex20IMDBclone;

import java.util.List;
import java.util.Map;

public class Imdb {

    List<Movie> movies;

    public Imdb(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getAllMoviesByGenre (Genre genre){
        return null;
    }

    public Map<Genre, List<Movie>> groupAllMoviesByGenre(){
        return null;
    }

    public List<Actor> findAllActorsByTypeAndGenre(Type type, Genre genre){
        return null;
    }
}
