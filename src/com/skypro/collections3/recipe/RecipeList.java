package com.skypro.collections3.recipe;

import java.util.HashSet;
import java.util.Objects;

public class RecipeList {
    private final HashSet<Recipe> bookForRecipes;

    public RecipeList() {
        this.bookForRecipes = new HashSet<>();
    }

    public void addRecipe(Recipe recipe) {
        for (Recipe recipe1 : bookForRecipes) {
            try {
                if (recipe.getName().equals(recipe1.getName())) throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("Такой рецепт уже существует в книге");
            }
        }
        bookForRecipes.add(recipe);
    }

    @Override
    public String toString() {
        return bookForRecipes + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeList that = (RecipeList) o;
        return Objects.equals(bookForRecipes, that.bookForRecipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookForRecipes);
    }
}


