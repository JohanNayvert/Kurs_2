package com.skypro.collections2.recipe;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private double amount;

    public Product(String name, double price, double amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()||name.isBlank()){
            throw new IllegalArgumentException("Введите наименование товара!");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new IllegalArgumentException("Введите стоимость товара!");
        }
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount<=0){
            throw new IllegalArgumentException("Введите количество товара!");
        }
        this.amount = amount;
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
        return "Продукт: " + name +
                ", цена - " + price +
                ", количество - " + amount;
    }
}
