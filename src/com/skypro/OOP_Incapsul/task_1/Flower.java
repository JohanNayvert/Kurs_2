package com.skypro.OOP_Incapsul.task_1;

public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    private void printFlower() {
        System.out.printf("Название: %s, Страна происхождения: %s, Цвет: %s, Цена: %.2f, Срок стояния: %d\n", getName(), getCountry(), getFlowerColor(), getCost(), getLifeSpan());
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Без названия";
        }
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
        this.printFlower();
    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
