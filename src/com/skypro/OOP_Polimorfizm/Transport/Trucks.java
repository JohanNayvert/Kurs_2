package com.skypro.OOP_Polimorfizm.Transport;

public class Trucks extends Transport implements Competing {
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String startMoving() {
        return "Грузовик начал движние";
    }

    public String finishMoving() {
        return "Грузовик закончил движние";
    }

    @Override
    public void pitStop() {
        System.out.println("Заезжает на питстоп");
    }

    @Override
    public void bestTimelap() {
        System.out.println("Лучший круг");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Лучшая скорость");
    }
}
