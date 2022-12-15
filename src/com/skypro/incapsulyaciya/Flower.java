package com.skypro.incapsulyaciya;

import java.util.Objects;

public class Flower {

    private final String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = validateName(name);
        this.flowerColor = validateFlowerColor(flowerColor);
        this.country = validateCountry(country);
        this.cost = validateCost(cost);
        this.lifeSpan = validatelifeSpan(lifeSpan);
    }

    public String getName() {
        return name;
    }

    private String validateName(String value) {
        return ValidateUtils.validateString(value, "Не указана");
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    private String validateFlowerColor(String value) {
        return ValidateUtils.validateString(value, "Не указана");
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = validateFlowerColor(flowerColor);
    }

    public String getCountry() {
        return country;
    }

    private String validateCountry(String value) {
        return ValidateUtils.validateString(value, "Не указана");
    }

    public void setCountry(String country) {
        this.country = validateCountry(country);
    }

    public double getCost() {
        return cost;
    }

    private double validateCost(double value) {
        return ValidateUtils.validateDouble(value, 1);
    }

    public void setCost(double cost) {
        this.cost = validateCost(cost);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    private int validatelifeSpan(int value) {
        return ValidateUtils.validateInteger(value, 0);
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = validatelifeSpan(lifeSpan);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.getCost(), getCost()) == 0 && getLifeSpan() == flower.getLifeSpan() && getName().equals(flower.getName()) && getFlowerColor().equals(flower.getFlowerColor()) && getCountry().equals(flower.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFlowerColor(), getCountry(), getCost(), getLifeSpan());
    }

    @Override
    public String toString() {
        return  "Название: " + name +
                ", страна происхождения: " + country +
                ", цвет: " + flowerColor +
                ", цена:" + cost +
                ", срок стояния=" + lifeSpan;
    }
    public static void printCompositionOfBouquet(Flower... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.printf("Стоимость букета: %.2f, Количество дней стояния: %d\n", totalCost, minLifeSpan);
    }
}
