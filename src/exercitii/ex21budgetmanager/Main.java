package exercitii.ex21budgetmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Purchase> purchases=new ArrayList<>();
        purchases.add(new Purchase("lapte",20,Category.Food));
        purchases.add(new Purchase("tricou",50,Category.CLOTHES));
        purchases.add(new Purchase("bluza",80,Category.CLOTHES));
        purchases.add(new Purchase("carne",100,Category.Food));
        User user1=new User(purchases,5000);






    }
}
