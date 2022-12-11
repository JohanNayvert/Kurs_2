package com.skypro.Polimorfizm.Transport;

public class Trucks extends Transport implements Competing {

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String startMoving() {
        return "Грузовик начал движние";
    }

    public String finishMoving() {
        return "Грузовик закончил движние";
    }

    @Override
    public void printType() {
        if (loadCapacity == null){
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Грузоподьемность: от " + loadCapacity.getFrom() + " т." + " до " + loadCapacity.getTo() + " т.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Грузоаик " + getBrand() + getModel() + " диагностику прошел");
        return true;
    }

    @Override
    public void fixCar() {
        System.out.println("Грузоаик " + getBrand() + getModel() + " отремонтировано");
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
