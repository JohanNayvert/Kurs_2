package com.skypro.collections3.recipe;

import java.util.HashMap;
import java.util.Objects;

public class Recipe {
    private Double sum;
    private String name;
    private final HashMap<Product, Integer> products;

    protected Recipe(String name, Double sum, Product... products) {
        this.products = new HashMap<>();
        setSum(0.0);
        for (Product product : products) {
            setSum((getSum() + product.getCost()) * product.getCount());
            this.products.put(product, product.getCount());
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) throw new RuntimeException();
        else this.name = name;
    }

    public Double getSum() {
        return sum;
    }

    private void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Название " + name + " сумма покупки " + sum + " список продуктов" + products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(sum, recipe.sum) && Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, name, products);
    }
}

