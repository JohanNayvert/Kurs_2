package com.skypro.OOP_Incapsul.task_1.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        printBus();
        this.refill();
    }

    @Override
    public String refill() {
        return "Заправляеться бензином или дизелем по транспортной карте";
    }

    public void printBus() {
        System.out.println("Название " + getBrand() +
                ", модель " + getModel() +
                ", года выпуска " + getProductionYear() +
                ", сборка в " + getProductionCountry() +
                ", максимальная скорость " + getMaxSpeed());
    }
}
