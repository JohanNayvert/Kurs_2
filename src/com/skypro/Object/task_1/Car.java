package com.skypro.Object.task_1;

public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void printCar() {
        System.out.printf("%s %s, %s года выпуска, сборка в %s, цвет кузова %s, обьем двигателя - %s\n", brand, model, productionYear, productionCountry, color, engineVolume);
    }
}