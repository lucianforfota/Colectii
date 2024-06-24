package exercitii.ex18shoppingcart;

import java.util.Map;

public class ShoppingCart {


    private Map<Product, Integer> cartMap;

    public ShoppingCart(Map<Product, Integer> cartMap) {
        this.cartMap = cartMap;
    }

    public void addProduct(Product product, int quantity){

    }

    public int getTotalPrice (){
        //initial pretul total e 0
        //parcurg setul de chei
             //la pretul total adun pe (pretul cheii curente * valoarea cheii curente)
        return 0;
    }

    public void removeProduct (Product product){

    }

    public void removeProduct(Product product, int numberOfProductsToRemove){

    }
}
