package com.skypro.Polimorfizm.Transport;

public class Buses extends Transport implements Competing {
    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String startMoving() {
        return "Автобус начал движние";
    }

    public String finishMoving() {
        return "Автобус закончил движние";
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
