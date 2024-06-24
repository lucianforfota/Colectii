package exercitii.ex9stockmarket;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //O bursa este structurata sub forma unei mape, cu cheia fiind numele companiei si
        // valoarea fiind pretul unei actiuni la acea companie.
        //
        //Exemplu: {Oracle=56, Google=421, Tesla=950}
        //
        //Scrie 2 metode:
        //
        //O metoda care sa gaseasca compania cu cel mai mare pret al unei actiuni din mapa
        //O metoda care sa gaseasca pretul mediu al preturilor actiunilor din mapa

        Map<String,Integer> prices = new HashMap<>();
        prices.put("Oracle",245);
        prices.put("Google",500);
        prices.put("Tesla",400);
        StockMarket stockMarket = new StockMarket(prices);
        System.out.println(stockMarket.getMostExpensiveCompany());
        System.out.println(stockMarket.getAverageSharePrice());
    }


}



