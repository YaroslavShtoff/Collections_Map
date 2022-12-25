package products;

import java.util.HashSet;
import java.util.Set;

public class ListRecipes {

   /* private Set<Recipe> recipes;


    public ListRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipes)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        if (!recipes.remove(recipe)) {
            throw new IllegalArgumentException("Такого рецепта нет");
        }*/

    private final Set<Recipe> recipes = new HashSet<>();

    public ListRecipes(Set<Recipe> recipes) {

    }

    public void add(Recipe recipe,  int count) {
        if ((recipes.contains(recipe))) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        }
        recipes.add(recipe);
    }



    }



