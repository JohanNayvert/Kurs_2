package com.skypro.Polimorfizm.Transport;

import java.util.Objects;

import static com.skypro.Incapsulyaciya.ValidateUtils.validateDouble;
import static com.skypro.Incapsulyaciya.ValidateUtils.validateString;

public abstract class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    private String validateBrand(String value) {
        return validateString(value, "Не указана");
    }

    public String getModel() {
        return model;
    }

    private String validateModel(String value) {
        return validateString(value, "Не указана");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    private double validateEngineVolume(double value) {
        return validateDouble(value, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && getBrand().equals(transport.getBrand()) && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", обьем двигателя: " + engineVolume;
    }

    public abstract String startMoving();

    public abstract String finishMoving();

    public abstract void printType();
}
