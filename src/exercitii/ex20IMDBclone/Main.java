package exercitii.ex20IMDBclone;

import javax.management.remote.rmi.RMIConnectionImpl_Stub;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static exercitii.ex20IMDBclone.Genre.ACTION;
import static exercitii.ex20IMDBclone.Type.MOVIE;
import static exercitii.ex20IMDBclone.Type.TV_SHOW;

public class Main {
//    20. IMDB clone
//    Un film este caracterizat de title, releaseYear, genre, cast (lista de actori), type, reviews (lista de review-uri)
//
//    Genre poate fi DRAMA, COMEDY, sau ACTION. Type poate fi MOVIE sau TV_SHOW.
//
//    Un review poate sa fie ONE_STAR, TWO_STARS, THREE_STARS, FOUR_STARS, FIVE_STARS.
//
//    Un actor are nume si prenume.
//
//    Un utilizator al aplicatiei are nume, prenume si o lista de filme favorite. Utilizatorul poate fi de doua tipuri: admin sau client.
//
//    Creeaza o clasa UserService
//
//    Adaugarea unui review la un film
//    Adaugarea unui film la o lista de filme favorite
//    Creeaza o clasa IMDBService, care sa aiba o lista de filme si care sa implementeze urmatoarele operatii:
//
//    Gruparea tuturor filmelor dupa gen
//    Gasirea tuturor filmelor in care joaca un anumit actor
//    Ordonarea filmelor dupa anul aparitiei
//    Ordonarea filmelor dupa review-uri, descrescator (de la media de review-uri cea mai buna in jos)
//    Gasirea tuturor actorilor care au jucat in filme de un anumit tip si gen
//    Gasirea celui mai apreciat film de un anumit tip si gen
//    Gasirea autorului care a jucat in cele mai multe filme
//    Cele mai populare n filme (bazat pe cat de des apar acele filme apar in listele de filme favorite ale utilizatorilor)
//

    public static void main(String[] args) {
        Actor actor1 = new Actor("jason", "statham");
        Actor actor2 = new Actor("silvester", "stalone");
        Actor actor3 = new Actor("jackie", "chan");
        Actor actor4 = new Actor("james", "bond");
        Actor actor5 = new Actor("cillian", "murphy");

        Set<Actor> actorsmovie1 = new HashSet<>();
        actorsmovie1.add(actor1);
        actorsmovie1.add(actor2);
        List<Review> reviewmovie1 = new ArrayList<>();
        reviewmovie1.add(Review.FIVE_STARS);
        reviewmovie1.add(Review.ONE_STAR);
        reviewmovie1.add(Review.TWO_STARS);
        Movie movie1 = new Movie("Homefront", 2013, Genre.ACTION, actorsmovie1, Type.MOVIE, reviewmovie1);

        Set<Actor> actorsmovie2 = new HashSet<>();
        actorsmovie2.add(actor4);
        actorsmovie2.add(actor5);
        List<Review> reviewmovie2 = new ArrayList<>();
        reviewmovie2.add(Review.FIVE_STARS);
        reviewmovie2.add(Review.TWO_STARS);
        reviewmovie2.add(Review.ONE_STAR);
        Movie movie2 = new Movie("Peaky Blinders", 2018, Genre.ACTION, actorsmovie2, Type.TV_SHOW, reviewmovie2);

        Set<Actor> actorsmovie3 = new HashSet<>();
        actorsmovie3.add(actor3);
        actorsmovie3.add(actor2);
        List<Review> reviewmovie3 = new ArrayList<>();
        reviewmovie3.add(Review.FIVE_STARS);
        reviewmovie3.add(Review.ONE_STAR);
        reviewmovie3.add(Review.TWO_STARS);
        reviewmovie3.add(Review.ONE_STAR);
        Movie movie3 = new Movie("Goldfinger", 1963, Genre.ACTION, actorsmovie3, Type.MOVIE, reviewmovie2);
//        Review review=new Review(6);


        List<Movie> imdb = List.of(movie1, movie2, movie3);
        Imdb imdb1 = new Imdb(imdb);

        imdb1.getAllMoviesByGenre(Genre.ACTION);
        System.out.println(imdb1.findMostPopularActor());

    }
}