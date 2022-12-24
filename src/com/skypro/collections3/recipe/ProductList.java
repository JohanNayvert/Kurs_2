package com.skypro.collections3.recipe;

import java.util.*;

public class ProductList {
    private final HashSet<Product> products;

    protected ProductList() {
        this.products = new HashSet<>();
    }

    public void addNewProduct(String name, Double weight, Double cost, Integer count) {
        Product product = new Product(name, weight, cost, count);
        try {
            if (products.contains(product)) throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Такой продукт уже имеется в корзине");
        }
        products.add(product);
    }

    public void removeFromBasket(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    @Override
    public String toString() {
        return products + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
