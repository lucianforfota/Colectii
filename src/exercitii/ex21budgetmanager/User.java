package exercitii.ex21budgetmanager;

import java.util.*;
import java.util.stream.Collectors;

public class User {
    private List<Purchase> purchases;
    private int maxbudget;

    public User(List<Purchase> purchases, int maxbudget) {
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

    public Map<Category, List<Purchase>> groupPurchasesByCategory() {
        Map<Category, List<Purchase>> purchasesByCategory = new HashMap<>();
        for (Purchase purchase : purchases) {
            //daca categoria lui purchase nu se afla in mapa ca si cheie
            //punem in mapa cheia categoria lui purchase si valoarea o lista cu purchase curenta
            //altfel
            //adauga in lista (care e valoarea la cheia categoria lui purchase) pe purchase-ul curent
            if (!purchasesByCategory.containsKey(purchase.getCategory())) {
                List<Purchase> value = new ArrayList<>();
                value.add(purchase);
                purchasesByCategory.put(purchase.getCategory(), value);
            } else {
                purchasesByCategory.get(purchase.getCategory()).add(purchase);
            }
        }
        return purchasesByCategory;
    }

    public Map<Category, List<Purchase>> groupPurchasesByCategoryLambda() {

        return purchases.stream()
                .collect(Collectors.groupingBy(purchase -> purchase.getCategory()));
    }


    //vizualizarea categoriei in care s-a cheltuit cel mai mut
    public Category getTheCategoryWithTheHighestPurchase() {
        //apelam medoda care creaza o mapa si bagam rezultatul intr-o variabila
        Map<Category, Double> categoriesByPrice = groupCategoriesByTotalPrice();
        return getaAcoloUndeMiamDatTotiBanii(categoriesByPrice);
    }

    public Category getaAcoloUndeMiamDatTotiBanii(Map<Category, Double> categoriesByPrice) {
        //parcurg fiecare cheie din mapa
        double maxValue = 0;
        Category acoloUndeMiamDatTotiBanii = null;
        for (Category category : categoriesByPrice.keySet()) {
            //daca valoarea de la cheia curenta este mai mare decat maxValue
            if (categoriesByPrice.get(category) > maxValue) {
                maxValue = categoriesByPrice.get(category);
                acoloUndeMiamDatTotiBanii = category;
            }
        }

        return acoloUndeMiamDatTotiBanii;
    }

    //for (Double price : categoriesByPrice.values()) {
    //parcurg fiecare valoare din mapa(??Olimpiu intrebare)


    public Map<Category, Double> groupCategoriesByTotalPrice() {
        Map<Category, Double> categoryByPrice = new HashMap<>();
        for (Purchase purchase : purchases) {
            if (!categoryByPrice.containsKey(purchase.getCategory())) {
                categoryByPrice.put(purchase.getCategory(), purchase.getPrice());
            } else {
                categoryByPrice.put(purchase.getCategory(), categoryByPrice.get(purchase.getCategory()) + purchase.getPrice());
            }
        }
        return categoryByPrice;
    }
}


