package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListProducts {
    private Map<Product,Integer> products = new HashMap<>();
    public ListProducts(Set<Product> productSet) {
        this.products = products;
    }

    public ListProducts() {

    }

    public void add(Product product,  int count) {
        if ((products.containsKey(product))) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.put(product,count);
    }
    public void add(Product product) {
        add(product, 1);
    }



    public void remove(Product product) {
        if ((products.containsKey(product))) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.put(product,1);
    }


}