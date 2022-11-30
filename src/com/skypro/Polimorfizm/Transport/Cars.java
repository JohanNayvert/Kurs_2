package com.skypro.Polimorfizm.Transport;

public class Cars extends Transport implements Competing {

    public Cars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String startMoving() {
        return "Автомобиль начал движние";
    }

    public String finishMoving() {
        return "Автомобиль закончил движние";
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
