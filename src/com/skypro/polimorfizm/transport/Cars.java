package com.skypro.polimorfizm.transport;

public class Cars extends Transport implements Competing {

    private TypeCase typeCase;

    public Cars(String brand, String model, double engineVolume, TypeCase typeCase) {
        super(brand, model, engineVolume);
        this.typeCase = typeCase;
    }

    public TypeCase getTypeCase() {
        return typeCase;
    }

    public void setTypeCase(TypeCase typeCase) {
        this.typeCase = typeCase;
    }

    public String startMoving() {
        return "Автомобиль начал движние";
    }

    public String finishMoving() {
        return "Автомобиль закончил движние";
    }

    @Override
    public void printType() {
        if (typeCase == null){
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип кузова: " + typeCase);
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " диагностику прошел");
        return true;
    }

    @Override
    public void fixCar() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " отремонтировано");
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
