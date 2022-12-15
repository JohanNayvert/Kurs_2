package com.skypro.collections2.recipe;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Product banana = new Product("Банан", 350, 3.425);
        Product apple = new Product("Яблоко", 120, 1.22);
        Product vegOil = new Product("Растительное масло", 220, 0.750);
        Product milk = new Product("Молоко", 80, 1);

        Set<Product> smuziBananList = new HashSet<>();
        smuziBananList.add(banana);
        smuziBananList.add(milk);
        Recipe smuziBanan = new Recipe("Банановый смузи", smuziBananList, 4.645);
        System.out.println(smuziBanan);

    }
}
