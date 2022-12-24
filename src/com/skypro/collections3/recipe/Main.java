package com.skypro.collections3.recipe;

public class Main {

    public static void main(String[] args) {

        Product banana = new Product("Банан", 3.12,349.12, 5);
        Product milk = new Product("Молоко", 1.0,89.0,1);
        Product apple = new Product("Яблоко", 2.560, 127.23, 9);
        Product oilRast = new Product("Растительное масло", 0.750, 98.0, 1);

        ProductList pokupki = new ProductList();
        pokupki.addNewProduct("Банан", 3.12,349.12, 5);
        pokupki.addNewProduct("Молоко", 1.0,89.0,1);
        pokupki.addNewProduct("Яблоко", 2.560, 127.23, 9);
        pokupki.addNewProduct("Растительное масло", 0.750, 98.0, 1);

        Recipe smuziBanana = new Recipe("Банановый смузи",250D, banana, milk);

        System.out.println(banana);
        System.out.println(milk);
        System.out.println(smuziBanana);

    }
}
