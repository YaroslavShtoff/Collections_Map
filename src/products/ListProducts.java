package products;

import java.util.HashSet;
import java.util.Set;

public class ListProducts {
    private Set<Product> products = new HashSet<>();

    public ListProducts(Set<Product> productSet) {
        this.products = products;
    }

    public void add(Product product) {
        if ((products.contains(product))) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.add(product);
    }
    public void remove(Product product) {
        if ((products.contains(product))) {
            throw new IllegalArgumentException("Такой продукт уже есть!");
        }
        products.add(product);
    }

}