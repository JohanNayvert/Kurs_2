package com.skypro.Incapsulyaciya.transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.refill();
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправляется на АТП");
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
