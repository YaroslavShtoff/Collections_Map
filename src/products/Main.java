package products;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product beet = new Product("Свекла", 67, 5);
        Product herring = new Product("Сельдь", 220, 3);
        Product potatoes = new Product("Картофель", 80, 4);
        Product onion = new Product("Лук", 52, 2);
        Product carrot = new Product("Морковь", 74, 2);
        Product egg = new Product("Яйцо", 120, 2);
        Product mayo = new Product("Майонез", 140, 1);


        Set<Product> productSet = new HashSet<>();
        ListProducts listProducts = new ListProducts(productSet);
        listProducts.add(beet);
        listProducts.add(herring);
        listProducts.add(potatoes);
        listProducts.remove(beet);
        System.out.println();

        for (Product listProducts1 : productSet) {
            printInfo(listProducts1);
        }

        listProducts.add(beet);
        listProducts.add(herring);
        listProducts.add(potatoes);
        listProducts.add(onion);

/*
        Set<Product> products = new HashSet<>();

        products.add(beet);
        products.add(herring);
        products.add(potatoes);
        products.add(carrot);
        products.add(egg);
        products.add(onion);
        products.add(mayo);

        for (Product product1 : products) {
            printInfo(product1);*/
        for (Product listProduct : productSet) {
            printInfo(listProduct);
        }
        Set<Recipe> recipes = new HashSet<>();
        recipes = new HashSet<>();
        ListRecipes listRecipe = new ListRecipes(recipes);

    }


    private static void printInfo(Product product) {
        System.out.println(product);
    }
}


