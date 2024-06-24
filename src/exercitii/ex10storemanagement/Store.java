package exercitii.ex10storemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Store {

    private Map<Category, List<Product>> productsByCategory;


    public Store(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }

    public void addProduct (Product product, Category category){
        if (!productsByCategory.containsKey(category)){
            List<Product> products = new ArrayList<>();
            products.add(product);
            productsByCategory.put(category,products);
        } else {
            productsByCategory.get(category).add(product);
        }
    }

    public void deleteProduct(Product product){

    }

    public Set<Category> getAllCategories (){
        return productsByCategory.keySet();
    }

    public List<Product> getProductsByCategory (Category category){
        return productsByCategory.get(category);
    }
}
