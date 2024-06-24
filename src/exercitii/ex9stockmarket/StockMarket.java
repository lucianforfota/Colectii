package exercitii.ex9stockmarket;

import java.util.Map;

public class StockMarket {

    private Map<String, Integer> pricesByCompany;


    public StockMarket(Map<String, Integer> pricesByCompany) {
        this.pricesByCompany = pricesByCompany;
    }

    public String getMostExpensiveCompany(){
        int maxPrice = 0;
        String mostExpensiveCompany = "";
        for (String company: pricesByCompany.keySet()){
            if (maxPrice < pricesByCompany.get(company)){
                maxPrice = pricesByCompany.get(company);
                mostExpensiveCompany = company;
            }
        }

        return mostExpensiveCompany;


    }


    public Double getAverageSharePrice(){
        Double sum = 0.0;
        for(String company: pricesByCompany.keySet()){
            sum+= pricesByCompany.get(company);
        }
        return sum/pricesByCompany.size();
    }



}
