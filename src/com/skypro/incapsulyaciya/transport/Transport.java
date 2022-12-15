package com.skypro.incapsulyaciya.transport;

import com.skypro.incapsulyaciya.ValidateUtils;

public abstract class Transport {
    private final String brand;
    private final String model;
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

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    private String validateBrand(String value) {
        return ValidateUtils.validateString(value, "Не указан");
    }

    public String getModel() {
        return model;
    }

    private String validateModel(String value) {
        return ValidateUtils.validateString(value, "Не указана");
    }

    public int getProductionYear() {
        return productionYear;
    }

    private int validateProductionYear(int value) {
        return ValidateUtils.validateInteger(value, 2000);
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = validateProductionYear(productionYear);
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    private String validateProductionCountry(String value) {
        return ValidateUtils.validateString(value, "Россия");
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = validateProductionCountry(productionCountry);
    }

    public String getColor() {
        return color;
    }

    private String validateColor(String value) {
        return ValidateUtils.validateString(value, "белый");
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    private double validateMaxSpeed(double value) {
        return ValidateUtils.validateDouble(value, 120);
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
