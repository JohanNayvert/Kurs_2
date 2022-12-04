package com.skypro.Polimorfizm.Transport;

public class Buses extends Transport implements Competing {

    private Bulk bulk;

    public Buses(String brand, String model, double engineVolume, Bulk bulk) {
        super(brand, model, engineVolume);
        this.bulk = bulk;
    }

    public Bulk getBulk() {
        return bulk;
    }

    public void setBulk(Bulk bulk) {
        this.bulk = bulk;
    }

    public String startMoving() {
        return "Автобус начал движние";
    }

    @Override
    public String finishMoving() {
        return "Автобус закончил движние";
    }

    @Override
    public void printType() {
        if (bulk == null){
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость: от " + bulk.getFrom() + " мест" + " до " + bulk.getTo() + " мест");
        }
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
