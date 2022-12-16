package com.skypro.collections2.recipe;

import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;
    private Set<Product> productList;
    private double totalCost;

    public Recipe(String name, Set<Product> productList, double amount) {
        setName(name);
        setProductList(productList);
        setTotalCost(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()||name.isBlank()){
            throw new IllegalArgumentException("Введите наименование рецепта!");
        }
        this.name = name;
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList =  productList;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        if (totalCost <=0){
            throw new IllegalArgumentException("Сумма не рассчитана!");
        }
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product that = (Product) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Название рецепта: " + name +
                ",\n список необходимых продуктов: " + productList +
                ",\n общая стоимость - " + totalCost;
    }
}

