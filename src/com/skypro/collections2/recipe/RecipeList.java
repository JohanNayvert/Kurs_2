package com.skypro.collections2.recipe;

import java.util.Set;

public class RecipeList {

    private final Set<Recipe> recipes;

    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }


    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void add (Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Рецепт с таким наименованием уже добавлен в список!");
        }
        recipes.add(recipe);
    }

    public void remove (Recipe recipe){
        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Название рецепта: " + recipes;
    }
}

