package com.skypro.OOP_Incapsul.task_1.transport;

import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateInteger;
import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateString;
import static com.skypro.OOP_Incapsul.task_1.ValidateUtils.validateDouble;

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
        this.printTrain();
        this.refill();
    }

    private double validateTripPrice(double value) {
        return validateDouble(value, 12);
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = validateTripPrice(tripPrice);
    }

    private int validateTripTime(int value) {
        return validateInteger(value, 25);
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = validateTripTime(tripTime);
    }

    private String validateNameStation(String value) {
        return validateString(value, "Станция");
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = validateNameStation(nameStation);
    }

    private String validateNEndingStation(String value) {
        return validateString(value, "Конечная");
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = validateNEndingStation(endingStation);
    }

    private int validateAmountWagons(int value) {
        return validateInteger(value, 5);
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = validateAmountWagons(amountWagons);
    }

    public void printTrain() {
        System.out.println(", Название " + getBrand() +
                ", модель " + getModel() +
                ", года выпуска " + getProductionYear() +
                ", сборка в " + getProductionCountry() +
                ", максимальная скорость " + getMaxSpeed() +
                ", цена билета " + getTripPrice() +
                ", время поездки " + getTripTime() +
                ", место отправки " + getNameStation() +
                ", место прибытия " + getEndingStation() +
                ", количество вагонов " + getAmountWagons());
    }


    public String refill() {
        return "Заправляеться дизельным топливом на станции";
    }

    @Override
    public String toString() {
        return "Train{" +
                "tripPrice=" + tripPrice +
                ", tripTime=" + tripTime +
                ", nameStation='" + nameStation + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", amountWagons=" + amountWagons +
                '}';
    }
}
