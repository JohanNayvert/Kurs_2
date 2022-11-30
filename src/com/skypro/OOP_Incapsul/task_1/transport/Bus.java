package com.skypro.OOP_Incapsul.task_1.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.refill();
    }

    @Override
    public String refill() {
        return "Заправляеться бензином или дизелем по транспортной карте";
    }

    @Override
    public String toString() {
        return "Название " + getBrand() +
                ", модель " + getModel() +
                ", год выпуска: " + getProductionYear() +
                ", сборка в " + getProductionCountry()+
                ", цвет: " + getColor() +
                ", максимальная скорость: " + getMaxSpeed();
    }
}
