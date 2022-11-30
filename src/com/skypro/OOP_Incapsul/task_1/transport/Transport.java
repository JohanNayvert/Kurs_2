package com.skypro.OOP_Incapsul.task_1.transport;

import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateInteger;
import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateString;
import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateDouble;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.productionYear = validateProductionYear(productionYear);
        this.productionCountry = validateProductionCountry(productionCountry);
        this.color = validateColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public abstract String refill();

    private String validateBrand(String value) {
        return validateString(value, "Не указан");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateBrand(brand);
    }

    private String validateModel(String value) {
        return validateString(value, "Не указана");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateModel(model);
    }

    private int validateProductionYear(int value) {
        return validateInteger(value, 2000);
    }

    public int getProductionYear() {
        return productionYear;
    }

    private String validateProductionCountry(String value) {
        return validateString(value, "Россия");
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    private String validateColor(String value) {
        return validateString(value, "белый");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    private double validateMaxSpeed(double value) {
        return validateDouble(value, 120);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
