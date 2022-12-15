package com.skypro.incapsulyaciya.transport;

import com.skypro.incapsulyaciya.ValidateUtils;

import java.util.Objects;

public class Train extends Transport {
    private double tripPrice;
    private int tripTime;
    private String nameStation;
    private String endingStation;
    private int amountWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed,
                 double tripPrice, int tripTime, String nameStation, String endingStation, int amountWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.tripPrice = validateTripPrice(tripPrice);
        this.tripTime = validateTripTime(tripTime);
        this.nameStation = validateNameStation(nameStation);
        this.endingStation = validateNEndingStation(endingStation);
        this.amountWagons = validateAmountWagons(amountWagons);
        this.refill();
    }

    public double getTripPrice() {
        return tripPrice;
    }

    private double validateTripPrice(double value) {
        return ValidateUtils.validateDouble(value, 12);
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = validateTripPrice(tripPrice);
    }

    public int getTripTime() {
        return tripTime;
    }

    private int validateTripTime(int value) {
        return ValidateUtils.validateInteger(value, 25);
    }

    public void setTripTime(int tripTime) {
        this.tripTime = validateTripTime(tripTime);
    }

    public String getNameStation() {
        return nameStation;
    }

    private String validateNameStation(String value) {
        return ValidateUtils.validateString(value, "Станция");
    }

    public void setNameStation(String nameStation) {
        this.nameStation = validateNameStation(nameStation);
    }

    public String getEndingStation() {
        return endingStation;
    }

    private String validateNEndingStation(String value) {
        return ValidateUtils.validateString(value, "Конечная");
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = validateNEndingStation(endingStation);
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    private int validateAmountWagons(int value) {
        return ValidateUtils.validateInteger(value, 5);
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = validateAmountWagons(amountWagons);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return Double.compare(train.getTripPrice(), getTripPrice()) == 0 && getTripTime() == train.getTripTime() && getAmountWagons() == train.getAmountWagons() && getNameStation().equals(train.getNameStation()) && getEndingStation().equals(train.getEndingStation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTripPrice(), getTripTime(), getNameStation(), getEndingStation(), getAmountWagons());
    }

    public void refill() {
        System.out.println("Поезд заправляется на станции");
    }

    @Override
    public String toString() {
        return  "Название " + getBrand() +
                ", модель " + getModel() +
                ", года выпуска " + getProductionYear() +
                ", сборка в " + getProductionCountry() +
                ", максимальная скорость: " + getMaxSpeed() +
                ", цена билета: " + getTripPrice() +
                ", время поездки: " + getTripTime() +
                ", место отправки- " + getNameStation() +
                ", место прибытия- " + getEndingStation() +
                ", количество вагонов: " + getAmountWagons();
    }
}
