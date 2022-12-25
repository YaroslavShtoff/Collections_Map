package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private String name;
    private  final Map<Product,Integer> products;
    private int totalCost;

    public Recipe(String name) {
        this.name = name;
        this.products= new HashMap();
        this.totalCost = 0;
    }

    public String getName() {
        return name;
    }

    public void add(Product product) {
        add(product,1);
    }
    public void add(Product product,int count) {
        if ((products.containsKey(product))) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        }
        products.put(product,count);
        totalCost +=count * product.getPrice();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;}

        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}