package exercitii.ex21budgetmanager;

import exercitii.ex20IMDBclone.Genre;
import exercitii.ex20IMDBclone.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private List<Purchase> purchases;
    private int maxbudget;

    public User( int maxbudget) {
        this.maxbudget = maxbudget;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public int getMaxbudget() {
        return maxbudget;
    }

    public void setMaxbudget(int maxbudget) {
        this.maxbudget = maxbudget;
    }

    public List<Purchase> getAllPurchasesByCategory(Category category) {
        //TODO de facut


        return purchases;

    }

    public Map<Category, List<Purchase>> groupPurchasesByCategory(){
        Map<Category, List<Purchase>> purchasesByCategory = new HashMap<>();
        for (Purchase purchase: purchases){
            //daca categoria lui purchase nu se afla in mapa ca si cheie
                //punem in mapa cheia categoria lui purchase si valoarea o lista cu purchase curenta
            //altfel
                //adauga in lista (care e valoarea la cheia categoria lui purchase) pe purchase-ul curent
            if(!purchasesByCategory.containsKey(purchase.getCategory())){
                List<Purchase> value = new ArrayList<>();
                value.add(purchase);
                purchasesByCategory.put(purchase.getCategory(),value);
            } else{
                purchasesByCategory.get(purchase.getCategory()).add(purchase);
            }
        }
        return purchasesByCategory;
    }







//    public List<Movie> getAllMoviesByGenre(Genre genre) {
//        List<Movie> genreMovies = new ArrayList<>();
//        for (Movie movie : movies) {
//            //daca genul movi-ului curent este egal cu cel care vine ca parametru
//            if (movie.getGenre().equals(genre)){
//                genreMovies.add(movie);
//            }
//        }
//        return genreMovies;



}
