package com.skypro.collections2.recipe;

import java.util.Set;

public class ProductList {

    private final Set<Product> products;

    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public void add (Product product){
        if (products.contains(product)){
            throw new IllegalArgumentException("Товар с таким наименованием уже добавлен в список!");
        }
        products.add(product);
    }

    public void remove (Product product){
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Продукты: " + products;
    }
}
